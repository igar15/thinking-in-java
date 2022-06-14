package ru.javaprojects.thinkinginjava.chapter17.exercise27;

import java.util.Objects;

public class CountedString {
    private static int counter;
    private String string;
    private int count;

    public CountedString(String string) {
        this.string = string;
        count = counter++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountedString that = (CountedString) o;
        return count == that.count &&
                Objects.equals(string, that.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(string);
    }

    @Override
    public String toString() {
        return "CountedString{" +
                "string='" + string + '\'' +
                ", count=" + count +
                '}';
    }
}
