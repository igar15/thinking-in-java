package ru.javaprojects.thinkinginjava.chapter17.exercise41;

import java.util.Objects;

public class TwoString implements Comparable<TwoString> {
    private String first;
    private String second;

    public TwoString(String first, String second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int compareTo(TwoString o) {
        return first.compareTo(o.first);
    }

    public String getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "TwoString{" +
                "first='" + first + '\'' +
                ", second='" + second + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TwoString twoString = (TwoString) o;
        return Objects.equals(first, twoString.first) &&
                Objects.equals(second, twoString.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}
