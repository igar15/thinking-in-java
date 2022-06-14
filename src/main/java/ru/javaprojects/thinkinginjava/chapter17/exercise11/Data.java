package ru.javaprojects.thinkinginjava.chapter17.exercise11;

import java.util.Random;

public class Data implements Comparable<Data> {
    private static Random random = new Random();
    private Integer value;

    public Data() {
        value = random.nextInt(100);
    }

    @Override
    public int compareTo(Data o) {
        return value.compareTo(o.value);
    }

    @Override
    public String toString() {
        return "Data{" +
                "value=" + value +
                '}';
    }
}
