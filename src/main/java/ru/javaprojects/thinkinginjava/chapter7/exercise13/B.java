package ru.javaprojects.thinkinginjava.chapter7.exercise13;

public class B extends A {

    public void doSomething(float f) {
        System.out.println("float");
    }

    public static void main(String[] args) {
        B b = new B();
        b.doSomething(1.0f);
        b.doSomething(5);
        b.doSomething("xsds");
        b.doSomething('c');
    }
}
