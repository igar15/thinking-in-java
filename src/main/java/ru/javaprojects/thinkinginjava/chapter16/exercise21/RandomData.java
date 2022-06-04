package ru.javaprojects.thinkinginjava.chapter16.exercise21;

public class RandomData implements Comparable<RandomData> {
    private int value;

    public RandomData(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(RandomData o) {
        return Integer.compare(value, o.value);
    }

    @Override
    public String toString() {
        return value + "";
    }
}
