package ru.javaprojects.thinkinginjava.chapter6.exercise6;

public class Example {
    protected String string;
}

class Example2 {
    public void check() {
        System.out.println(new Example().string);
    }
}