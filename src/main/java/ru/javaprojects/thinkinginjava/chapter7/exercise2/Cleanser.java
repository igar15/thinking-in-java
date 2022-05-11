package ru.javaprojects.thinkinginjava.chapter7.exercise2;

public class Cleanser {
    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }

    public void scrub() {
        append("scrub");
    }
}
