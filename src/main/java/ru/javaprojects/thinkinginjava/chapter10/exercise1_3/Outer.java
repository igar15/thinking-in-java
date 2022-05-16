package ru.javaprojects.thinkinginjava.chapter10.exercise1_3;

public class Outer {
    private String s;

    public Outer(String s) {
        this.s = s;
    }

    public class Inner {
        @Override
        public String toString() {
            return s;
        }
    }

    public Inner getInner() {
        return new Inner();
    }
}
