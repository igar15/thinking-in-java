package ru.javaprojects.thinkinginjava.chapter10.exercise20;

public class Sequence {
    private Object[] items;
    private int capacity;
    private int size;

    public Sequence(int capacity) {
        this.capacity = capacity;
        items = new Object[capacity];
        size = 0;
    }

    public void add (Object item) {
        if (size < capacity) {
            items[size++] = item;
        }
    }

    public Selector selector() {
        return new Selector() {
            private int cursor;

            @Override
            public boolean hasNext() {
                return cursor < size;
            }

            @Override
            public Object current() {
                return items[cursor];
            }

            @Override
            public void next() {
                cursor++;
            }
        };
    }

    public Selector reverseSelector() {
        return new Selector() {
            private int cursor = size - 1;

            @Override
            public boolean hasNext() {
                return cursor >= 0;
            }

            @Override
            public Object current() {
                return items[cursor];
            }

            @Override
            public void next() {
                cursor--;
            }
        };
    }
}
