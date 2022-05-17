package ru.javaprojects.thinkinginjava.chapter10.exercise17;

import ru.javaprojects.thinkinginjava.chapter10.exercise17.MyClass.A.B;

public class MyClass {
    public static class A {
        public static class B {

        }
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
    }
}
