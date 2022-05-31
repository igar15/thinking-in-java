package ru.javaprojects.thinkinginjava.chapter15.exercise20;

public class Main {
    public static void main(String[] args) {
        doWork(new MyClass());
    }

    public static <T extends MyInterface> void doWork(T t) {
        t.a();
        t.b();
    }
}
