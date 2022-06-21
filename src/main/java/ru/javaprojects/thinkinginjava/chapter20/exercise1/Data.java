package ru.javaprojects.thinkinginjava.chapter20.exercise1;

public class Data {
    @SqlDouble(name = "price")
    private double d;

    public Data(double d) {
        this.d = d;
    }
}
