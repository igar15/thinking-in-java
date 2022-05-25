package ru.javaprojects.thinkinginjava.chapter12.exercise25;

public class B extends A {
    @Override
    public void f() throws Ex2 {
        throw new Ex2();
    }
}
