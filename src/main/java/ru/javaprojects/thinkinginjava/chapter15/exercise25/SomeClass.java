package ru.javaprojects.thinkinginjava.chapter15.exercise25;

public class SomeClass implements FirstInterface, SecondInterface {
    @Override
    public void a() {
        System.out.println("a");
    }

    @Override
    public void b() {
        System.out.println("b");
    }
}
