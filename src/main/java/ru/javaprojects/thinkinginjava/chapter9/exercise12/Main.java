package ru.javaprojects.thinkinginjava.chapter9.exercise12;

public class Main {
    public static void main(String[] args) {
        testClimb(new Hero());
    }

    public static void testClimb(CanClimb canClimb) {
        canClimb.climb();
    }
}
