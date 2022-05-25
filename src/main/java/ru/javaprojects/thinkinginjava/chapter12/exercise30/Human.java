package ru.javaprojects.thinkinginjava.chapter12.exercise30;

public class Human {
    public void doSm(int x) {
        if (x == 0) {
            throw new Ex1();
        }
        throw new Ex2();
    }
}
