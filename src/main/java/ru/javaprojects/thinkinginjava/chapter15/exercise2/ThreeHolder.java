package ru.javaprojects.thinkinginjava.chapter15.exercise2;

import java.util.Arrays;

public class ThreeHolder<T> {
    private Object[] store = new Object[3];

    public ThreeHolder(T value1, T value2, T value3) {
        store[0] = value1;
        store[1] = value2;
        store[2] = value3;
    }

    @SuppressWarnings("unchecked")
    public T getValue1() {
        return (T) store[0];
    }

    public void setValue1(T value) {
        store[0] = value;
    }

    @SuppressWarnings("unchecked")
    public T getValue2() {
        return (T) store[1];
    }

    public void setValue2(T value) {
        store[1] = value;
    }

    @SuppressWarnings("unchecked")
    public T getValue3() {
        return (T) store[2];
    }

    public void setValue3(T value) {
        store[2] = value;
    }

    @Override
    public String toString() {
        return Arrays.toString(store);
    }
}
