package ru.javaprojects.thinkinginjava.chapter11.exercise10;

public abstract class Rodent {
    public Rodent() {
        System.out.println("Rodent cons");
    }

    public abstract void run();
    public abstract void eat();
}
