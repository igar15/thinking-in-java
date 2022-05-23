package ru.javaprojects.thinkinginjava.chapter11.exercise30;

import java.util.*;

public class CollectionSequence implements Collection<Pet> {
    private int size = 0;
    private Pet[] pets = new Pet[2];

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        if (!(o instanceof Pet)) {
            return false;
        }
        boolean contains = false;
        Pet target = (Pet) o;
        for (Pet pet : pets) {
            if (target.equals(pet)) {
                contains = true;
                break;
            }
        }
        return contains;
    }

    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int cursor = 0;

            @Override
            public boolean hasNext() {
                return cursor < size();
            }

            @Override
            public Pet next() {
                return pets[cursor++];
            }
        };
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(pets, pets.length);
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return (T[]) Arrays.copyOf(pets, pets.length);
    }

    @Override
    public boolean add(Pet pet) {
        if (pets.length == size()) {
            pets = Arrays.copyOf(pets, pets.length * 2);
        }
        pets[size++] = pet;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (!(o instanceof Pet)) {
            return false;
        }
        boolean contains = false;
        Pet target = (Pet) o;
        for (int i = 0; i < size(); i++) {
            if (pets[i].equals(target)) {
                contains = true;
                for (int j = i; j < size() - 1; j++) {
                    pets[j] = pets[j + 1];
                }
                size--;
                break;
            }
        }
        return contains;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        boolean containsAll = true;
        for (Object pet : c) {
            boolean result = contains(pet);
            if (!result) {
                containsAll = false;
            }
        }
        return containsAll;
    }

    @Override
    public boolean addAll(Collection<? extends Pet> c) {
        for (Pet pet : c) {
            add(pet);
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean contains = false;
        for (Object pet : c) {
            boolean result = remove(pet);
            if (result == true) {
                contains = true;
            }
        }
        return contains;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        List<Pet> forDelete = new ArrayList<>();
        for (Pet pet : pets) {
            if (!c.contains(pet)) {
                forDelete.add(pet);
            }
        }
        forDelete.forEach(this::remove);
        return !forDelete.isEmpty();
    }

    @Override
    public void clear() {
        pets = new Pet[pets.length];
        size = 0;
    }
}
