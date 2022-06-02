package ru.javaprojects.thinkinginjava.chapter15.exercise34;

public abstract class A<T extends A<T>> {
    private T element;

        public abstract T work(T t);

    public T doWork() {
        return work(element);
    }
}
