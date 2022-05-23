package ru.javaprojects.thinkinginjava.chapter11.exercise32;

import ru.javaprojects.thinkinginjava.chapter11.exercise30.Pet;

import java.util.*;

public class PetSequence {
    private Pet[] pets = {new Pet("Dog"), new Pet("Cat"), new Pet("Bird")};

    public Iterable<Pet> iterator() {
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                return new Iterator<Pet>() {
                    private int cursor = 0;

                    @Override
                    public boolean hasNext() {
                        return cursor < pets.length;
                    }

                    @Override
                    public Pet next() {
                        return pets[cursor++];
                    }
                };
            }
        };
    }

    public Iterable<Pet> reversed() {
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                return new Iterator<Pet>() {
                    private int cursor = pets.length - 1;

                    @Override
                    public boolean hasNext() {
                        return cursor >= 0;
                    }

                    @Override
                    public Pet next() {
                        return pets[cursor--];
                    }
                };
            }
        };
    }

    public Iterable<Pet> random() {
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                List<Pet> copy = new ArrayList<>(Arrays.asList(pets));
                Collections.shuffle(copy);
                return copy.iterator();
            }
        };
    }
}
