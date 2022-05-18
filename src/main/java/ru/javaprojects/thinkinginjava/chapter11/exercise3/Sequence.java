package ru.javaprojects.thinkinginjava.chapter11.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Sequence {
    private List items;
    private int size;

    public Sequence() {
        items = new ArrayList();
        size = 0;
    }

    public void add (Object item) {
        items.add(item);
        size++;
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
                return items.get(cursor);
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
                return items.get(cursor);
            }

            @Override
            public void next() {
                cursor--;
            }
        };
    }
}
