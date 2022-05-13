package ru.javaprojects.thinkinginjava.chapter8.exercise1_5_18;

public class UniCycle extends Cycle {
    @Override
    public int wheels() {
        return 1;
    }

    public void balance() {
        System.out.println("uni balance");
    }
}
