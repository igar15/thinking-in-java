package ru.javaprojects.thinkinginjava.chapter7.exercise5;

public class A {
    {
        System.out.println("Non static block before A Constructor");
    }
    public A() {
        System.out.println("A");
    }
}
