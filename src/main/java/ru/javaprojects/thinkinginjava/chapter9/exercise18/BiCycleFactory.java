package ru.javaprojects.thinkinginjava.chapter9.exercise18;

public class BiCycleFactory implements CycleFactory {
    public Cycle createCycle() {
        return new Bicycle();
    }
}
