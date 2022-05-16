package ru.javaprojects.thinkinginjava.chapter10.exercise8;

public class Outer {

    public void doSomething() {
        System.out.println(new Inner().x);
    }

    class Inner {
        private int x = 10;
    }
}
