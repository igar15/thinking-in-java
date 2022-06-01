package ru.javaprojects.thinkinginjava.chapter15.exercise22;

public class Data {
    private String s;
    private int x;

    public Data(String s, Integer x) {
        this.s = s;
        this.x = x;
    }

    @Override
    public String toString() {
        return "Data{" +
                "s='" + s + '\'' +
                ", x=" + x +
                '}';
    }
}
