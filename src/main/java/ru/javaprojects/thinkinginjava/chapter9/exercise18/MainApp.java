package ru.javaprojects.thinkinginjava.chapter9.exercise18;

public class MainApp {
    public static void main(String[] args) {
        getCycle(new TriCycleFactory()).move();
        getCycle(new BiCycleFactory()).move();
        getCycle(new UniCycleFactory()).move();
    }

    public static Cycle getCycle(CycleFactory factory) {
        return factory.createCycle();
    }
}
