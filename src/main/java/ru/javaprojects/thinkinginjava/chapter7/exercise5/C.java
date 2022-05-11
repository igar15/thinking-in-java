package ru.javaprojects.thinkinginjava.chapter7.exercise5;

public class C extends A {
    {
        System.out.println("Non static block before C Constructor");
    }

    private B b = new B();


    public static void main(String[] args) {
        new C();
    }
}
