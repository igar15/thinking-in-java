package ru.javaprojects.thinkinginjava.chapter8.exercise1_5_18;

public class Main {
    public static void main(String[] args) {
        ride(new UniCycle());
        ride(new BiCycle());
        ride(new TriCycle());

        Cycle[] cycles = new Cycle[]{new UniCycle(), new TriCycle(), new BiCycle()};
        ((UniCycle) cycles[0]).balance();
//        ((TriCycle) cycles[1]).balance();
        ((BiCycle) cycles[2]).balance();
    }

    public static void ride(Cycle cycle) {
        cycle.ride();
    }
}
