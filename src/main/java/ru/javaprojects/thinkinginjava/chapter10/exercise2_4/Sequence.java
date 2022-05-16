package ru.javaprojects.thinkinginjava.chapter10.exercise2_4;

public class Sequence {
    private Object[] items;
    private int capacity;
    private int size;

    public Sequence(int capacity) {
        this.capacity = capacity;
        items = new Object[capacity];
        size = 0;
    }

    public void add(Object item) {
        if (size < capacity) {
            items[size] = item;
            size++;
        }
    }

    public Selector getSelector() {
        return new SequenceSelector();
    }

    private class SequenceSelector implements Selector {
        private int cursor = 0;

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

        public Sequence getSequence() {
            return Sequence.this;
        }
    }
}
