package ru.javaprojects.thinkinginjava.chapter17.compare_test;

import java.util.Objects;

public class Data implements Comparable<Data> {
    private int value;

    public Data(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return value == data.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "Data{" +
                "value=" + value +
                '}';
    }

    @Override
    public int compareTo(Data o) {
        return value > o.value ? 1 : (value < o.value ? -1 : 0);
    }
}
