package ru.javaprojects.thinkinginjava.chapter15.exercise4;

import java.util.Arrays;
import java.util.Iterator;

public class Sequence<T> implements Iterable<T> {
    private final int capacity;
    private final Object[] elements;
    private int size = 0;

    public Sequence(int capacity) {
        this.capacity = capacity;
        elements = new Object[capacity];
    }

    public boolean add(T element) {
        if (size < capacity) {
            elements[size++] = element;
            return true;
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int cursor = 0;

            @Override
            public boolean hasNext() {
                return cursor < size;
            }

            @Override
            @SuppressWarnings("unchecked")
            public T next() {
                return (T) elements[cursor++];
            }
        };
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
