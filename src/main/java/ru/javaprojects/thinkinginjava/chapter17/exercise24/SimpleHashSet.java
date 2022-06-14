package ru.javaprojects.thinkinginjava.chapter17.exercise24;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.LinkedList;

public class SimpleHashSet<E> extends AbstractSet<E> {
    private int size = 16;
    private LinkedList<E>[] buckets = new LinkedList[size];

    @Override
    public boolean add(E e) {
        int bucketIndex = Math.abs(e.hashCode() % size);
        if (buckets[bucketIndex] == null) {
            buckets[bucketIndex] = new LinkedList<>();
            buckets[bucketIndex].add(e);
            return true;
        } else {
            if (buckets[bucketIndex].contains(e)) {
                return false;
            } else {
                buckets[bucketIndex].add(e);
                return true;
            }
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int bucketCursor;
            private Iterator<E> current = getIterator();

            private Iterator<E> getIterator() {
                Iterator<E> iterator = null;
                for (int i = bucketCursor; i < buckets.length; i++) {
                    if (buckets[i] != null) {
                        iterator = buckets[i].iterator();
                        bucketCursor = i + 1;
                        break;
                    }
                }
                return iterator;
            }

            @Override
            public boolean hasNext() {
                if (current == null) {
                    return false;
                }
                boolean result = current.hasNext();
                if (result) {
                    return true;
                } else {
                    current = getIterator();
                    if (current == null) {
                        return false;
                    }
                    return current.hasNext();
                }
            }

            @Override
            public E next() {
                return current.next();
            }
        };
    }

    @Override
    public int size() {
        int size = 0;
        for (LinkedList<E> bucket : buckets) {
            if (bucket != null) {
                size += bucket.size();
            }
        }
        return size;
    }
}
