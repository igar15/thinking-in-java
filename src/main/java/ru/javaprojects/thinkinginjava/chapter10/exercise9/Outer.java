package ru.javaprojects.thinkinginjava.chapter10.exercise9;

public class Outer {
    private class Inner implements MyInterface {
        @Override
        public void doSm() {
            System.out.println("123");
        }
    }

    public MyInterface getInterface() {
        return new Inner();
    }
}
