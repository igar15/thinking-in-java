package ru.javaprojects.thinkinginjava.chapter17.exercise28;

import java.util.Objects;

public class Tuple<E extends Comparable<E>, F extends Comparable<F>> implements Comparable<Tuple<E, F>> {
    private E first;
    private F second;

    public Tuple(E first, F second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int compareTo(Tuple<E, F> o) {
        int firstCompareResult = this.first.compareTo(o.first);
        if (firstCompareResult == 0) {
            return this.second.compareTo(o.second);
        }
        return firstCompareResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple<?, ?> tuple = (Tuple<?, ?>) o;
        return Objects.equals(first, tuple.first) &&
                Objects.equals(second, tuple.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    @Override
    public String toString() {
        return "Tuple{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
