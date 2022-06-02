package ru.javaprojects.thinkinginjava.chapter15.exercise32;

public class FixedSizeStack<T> {
    private Object[] items;
    private int cursor = 0;

    public FixedSizeStack(int size) {
        items = new Object[size];
    }

    public void push(T t) {
        items[cursor++] = t;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        return (T) items[cursor--];
    }
}
