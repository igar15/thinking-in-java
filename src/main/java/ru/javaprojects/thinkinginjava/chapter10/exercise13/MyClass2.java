package ru.javaprojects.thinkinginjava.chapter10.exercise13;

public class MyClass2 {
    public MyClass getInstance() {
        return new MyClass(10, "123");
    }

    public static void main(String[] args) {
        new MyClass2().getInstance();
    }
}
