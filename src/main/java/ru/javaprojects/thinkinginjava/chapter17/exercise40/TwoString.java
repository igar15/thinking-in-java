package ru.javaprojects.thinkinginjava.chapter17.exercise40;

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
}
