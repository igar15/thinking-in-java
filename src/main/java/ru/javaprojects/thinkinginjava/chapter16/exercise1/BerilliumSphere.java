package ru.javaprojects.thinkinginjava.chapter16.exercise1;

public class BerilliumSphere {
    private static long counter = 0;
    private long count;

    public BerilliumSphere() {
        count = counter++;
    }

    @Override
    public String toString() {
        return "BerilliumSphere " + count;
    }
}
