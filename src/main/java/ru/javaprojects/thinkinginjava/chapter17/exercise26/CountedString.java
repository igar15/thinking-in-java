package ru.javaprojects.thinkinginjava.chapter17.exercise26;

import java.util.Objects;

public class CountedString {
    private static int counter;
    private String string;
    private int count;
    private char c;

    public CountedString(String string, char c) {
        this.string = string;
        this.c = c;
        count = counter++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountedString that = (CountedString) o;
        return count == that.count &&
                c == that.c &&
                Objects.equals(string, that.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(string, count, c);
    }
}
