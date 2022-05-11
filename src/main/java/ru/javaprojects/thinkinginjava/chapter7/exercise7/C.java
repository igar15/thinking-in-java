package ru.javaprojects.thinkinginjava.chapter7.exercise7;

public class C extends A {
    private B b;

    public C() {
        super(11);
        b = new B(11);
    }

    public static void main(String[] args) {
        new C();
    }
}
