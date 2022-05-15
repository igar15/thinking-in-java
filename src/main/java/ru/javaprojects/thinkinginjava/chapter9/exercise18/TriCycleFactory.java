package ru.javaprojects.thinkinginjava.chapter9.exercise18;

public class TriCycleFactory implements CycleFactory {
    public Cycle createCycle() {
        return new Tricycle();
    }
}
