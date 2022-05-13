package ru.javaprojects.thinkinginjava.chapter8.exercise1_5_18;

public class BiCycle extends Cycle {

    @Override
    public int wheels() {
        return 2;
    }

    public void balance() {
        System.out.println("bi balance");
    }
}
