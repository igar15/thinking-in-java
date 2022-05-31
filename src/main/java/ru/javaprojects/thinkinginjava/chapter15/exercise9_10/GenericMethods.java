package ru.javaprojects.thinkinginjava.chapter15.exercise9_10;

public class GenericMethods {
    public <A, B> void f(A x, B y, int z) {
        System.out.println(x.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        new GenericMethods().f("", "", 10);
        new GenericMethods().f(1, "", 5);
    }
}
