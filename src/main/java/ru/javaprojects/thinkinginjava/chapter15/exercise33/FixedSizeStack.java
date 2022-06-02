package ru.javaprojects.thinkinginjava.chapter15.exercise33;

import java.util.ArrayList;
import java.util.List;

public class FixedSizeStack<T> {
    private List<T> items;

    public FixedSizeStack(int size) {
        items = new ArrayList<>(size);
    }

    public void push(T t) {
        items.add(t);
    }

    public T pop() {
        return items.remove(items.size() - 1);
    }
}
