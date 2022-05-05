package ru.javaprojects.thinkinginjava.chapter5.exercise2;

public class Data {
    private String defaultString = "data";
    private int number;

    public Data(int number) {
        this.number = number;
    }

    public Data(String defaultString, int number) {
        this(number);
        this.defaultString = defaultString;
    }
}
