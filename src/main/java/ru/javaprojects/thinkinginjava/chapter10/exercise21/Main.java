package ru.javaprojects.thinkinginjava.chapter10.exercise21;

public class Main {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        B b = new B();
        b.addU(a1.getU());
        b.addU(a2.getU());
        b.addU(a3.getU());
        b.iterate();
        b.resetU(2);
    }
}
