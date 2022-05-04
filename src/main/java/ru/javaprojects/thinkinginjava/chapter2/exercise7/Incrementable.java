package ru.javaprojects.thinkinginjava.chapter2.exercise7;

public class Incrementable {
    static void increment() {
        StaticTest.i++;
    }

    public static void main(String[] args) {
        increment();
        System.out.println(StaticTest.i);
    }
}

class StaticTest {
    static int i = 47;
}
