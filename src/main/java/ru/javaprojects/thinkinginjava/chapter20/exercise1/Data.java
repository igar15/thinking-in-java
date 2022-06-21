package ru.javaprojects.thinkinginjava.chapter20.exercise1;

public class Data {
    @SqlDouble(name = "price", constraints = @Constraints(nonNull = true))
    private double d;

    public Data(double d) {
        this.d = d;
    }
}
