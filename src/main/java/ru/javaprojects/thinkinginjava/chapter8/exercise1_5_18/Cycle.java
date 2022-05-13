package ru.javaprojects.thinkinginjava.chapter8.exercise1_5_18;

public abstract class Cycle {
    public void ride() {
        System.out.println("Rides on " + wheels() + " wheels!");
    }

    public abstract int wheels();
}
