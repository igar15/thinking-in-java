package ru.javaprojects.thinkinginjava.chapter15.exercise25;

public class Main {
    public static <T extends FirstInterface> void first(T t) {
        t.a();
    }

    public static <T extends SecondInterface> void second(T t) {
        t.b();
    }

    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        first(someClass);
        second(someClass);
    }
}
