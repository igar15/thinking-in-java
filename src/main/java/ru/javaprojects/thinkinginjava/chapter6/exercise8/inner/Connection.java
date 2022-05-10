package ru.javaprojects.thinkinginjava.chapter6.exercise8.inner;

public class Connection {
    private int number;

    Connection(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Connection #" + number;
    }
}