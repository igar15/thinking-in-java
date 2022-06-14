package ru.javaprojects.thinkinginjava.chapter17.exercise10;

import java.lang.reflect.Array;
import java.util.*;

public class MySortedSet<E> implements SortedSet<E> {
    private LinkedList<E> storage = new LinkedList<>();

    @Override
    public Comparator<? super E> comparator() {
        return Comparator.comparing(o -> ((Comparable) o));
    }

    @Override
    public SortedSet<E> subSet(E fromElement, E toElement) {
        if (!containsAll(Arrays.asList(fromElement, toElement))) {
            throw new RuntimeException();
        }
        int firstIndex = storage.indexOf(fromElement);
        int lastIndex = storage.indexOf(toElement);
        MySortedSet<E> set = new MySortedSet<>();
        set.addAll(storage.subList(firstIndex, lastIndex));
        return set;
    }

    @Override
    public SortedSet<E> headSet(E toElement) {
        MySortedSet<E> set = new MySortedSet<>();
        for (E e : storage) {
            if (((Comparable) e).compareTo((Comparable) toElement) < 0) {
                set.add(e);
            } else {
                break;
            }
        }
        return set;
    }

    @Override
    public SortedSet<E> tailSet(E fromElement) {
        MySortedSet<E> set = new MySortedSet<>();
        for (E e : storage) {
            if (((Comparable) e).compareTo((Comparable) fromElement) >= 0) {
                set.add(e);
            }
        }
        return set;
    }

    @Override
    public E first() {
        return storage.getFirst();
    }

    @Override
    public E last() {
        return storage.getLast();
    }

    @Override
    public int size() {
        return storage.size();
    }

    @Override
    public boolean isEmpty() {
        return storage.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return storage.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return storage.iterator();
    }

    @Override
    public Object[] toArray() {
        return storage.toArray();
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T[] toArray(T[] a) {
        return (T[]) toArray();
    }

    @Override
    public boolean add(E e) {
        if (storage.isEmpty()) {
            storage.add(e);
            return true;
        } else {
            if (!storage.contains(e)) {
                for (int i = 0; i < storage.size(); i++) {
                    if (((Comparable) e).compareTo((Comparable) storage.get(i)) < 0) {
                        storage.add(i, e);
                    } else {
                        storage.add(e);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    @Override
    public boolean remove(Object o) {
        return storage.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return storage.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean addResult = false;
        for (E e : c) {
            boolean result = add(e);
            if (result) {
                addResult = true;
            }
        }
        return addResult;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return storage.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return storage.removeAll(c);
    }

    @Override
    public void clear() {
        storage.clear();
    }

    @Override
    public String toString() {
        return storage.toString();
    }
}
