package ru.javaprojects.thinkinginjava.chapter12.exercise4_8_28;

public class ExThrower {
    public static void doSm() {
        throw new MyException("ex");
    }

    public static void main(String[] args) {
        doSm();
    }
}
