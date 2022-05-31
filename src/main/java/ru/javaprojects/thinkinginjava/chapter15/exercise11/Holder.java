package ru.javaprojects.thinkinginjava.chapter15.exercise11;

public class Holder<T> {
    private T element;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}
