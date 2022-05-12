package ru.javaprojects.thinkinginjava.chapter8.exercise10;

public class A {
    public void first() {
        second();
    }

    public void second() {
        System.out.println("Baseclass second method");
    }
}
