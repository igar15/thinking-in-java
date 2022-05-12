package ru.javaprojects.thinkinginjava.chapter8.exercise1_5;

public class Main {
    public static void main(String[] args) {
        ride(new UniCycle());
        ride(new BiCycle());
        ride(new TriCycle());
    }

    public static void ride(Cycle cycle) {
        cycle.ride();
    }
}
