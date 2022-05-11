package ru.javaprojects.thinkinginjava.chapter7.exercise4;

public class AChild extends A {
    public AChild() {
        System.out.println("AChild");
    }

    public static void main(String[] args) {
        new AChild();
    }
}
