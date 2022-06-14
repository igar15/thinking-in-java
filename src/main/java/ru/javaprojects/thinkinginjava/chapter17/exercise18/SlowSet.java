package ru.javaprojects.thinkinginjava.chapter17.exercise18;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SlowSet<E> extends AbstractSet<E> {
    private List<E> storage = new ArrayList<>();

    @Override
    public boolean add(E e) {
        if (storage.contains(e)) {
            return false;
        } else {
            storage.add(e);
            return true;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return storage.iterator();
    }

    @Override
    public int size() {
        return storage.size();
    }
}
