package ru.javaprojects.thinkinginjava.chapter11.exercise9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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

    public Iterator iterator() {
        return items.iterator();
    }

    public Iterator reverseIterator() {
        return new Iterator() {
            private List reversedCopy = new ArrayList(items);
            private Iterator reverse;
            {
                Collections.reverse(reversedCopy);
                reverse = reversedCopy.iterator();
            }

            @Override
            public boolean hasNext() {
                return reverse.hasNext();
            }

            @Override
            public Object next() {
                return reverse.next();
            }
        };
    }
}
