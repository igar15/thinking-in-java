package ru.javaprojects.thinkinginjava.chapter16.exercise8;

public class Holder<T> {
    private T[] values;

    {
//        values = new T[2];
        values = (T[]) new Object[2];
    }

    public T[] getArray() {
        return values;
    }

}
