package ru.javaprojects.thinkinginjava.chapter15.exercise23;

public class Foo2<T> {
    private T x;

    public <F extends FactoryI<T>> Foo2(F factory) {
        x = factory.create("123");
    }
}
