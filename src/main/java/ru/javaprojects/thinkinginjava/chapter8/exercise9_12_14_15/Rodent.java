package ru.javaprojects.thinkinginjava.chapter8.exercise9_12_14_15;

public abstract class Rodent {
    public Rodent() {
        System.out.println("Rodent cons");
    }

    public abstract void run();
    public abstract void eat();
}
