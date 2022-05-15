package ru.javaprojects.thinkinginjava.chapter9.exercise18;

public class UniCycleFactory implements CycleFactory {
    public Cycle createCycle() {
        return new Unicycle();
    }
}
