package ru.javaprojects.thinkinginjava.chapter16.exercise9;

public class Peel<T> {
    private T element;

    public Peel(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }
}
