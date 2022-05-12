package ru.javaprojects.thinkinginjava.chapter8.exercise10;

public class B extends A {
    @Override
    public void second() {
        System.out.println("Subclass second method");
    }

    public static void main(String[] args) {
        B b = new B();
        A a = b;
        a.first();
    }
}
