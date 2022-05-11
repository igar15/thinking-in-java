package ru.javaprojects.thinkinginjava.chapter7.exercise1;

public class B {
    private A a;

    public void doSomething() {
        if (a == null) {
            a = new A();
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        B b = new B();
        b.doSomething();
    }
}
