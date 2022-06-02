package ru.javaprojects.thinkinginjava.chapter15.exercise28;

public class Generic2<T> {
    private T t;

    public Generic2(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void work(Generic1<? super T> generic1) {
        generic1.doSm(getT());
    }
}
