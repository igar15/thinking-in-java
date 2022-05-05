package ru.javaprojects.thinkinginjava.chapter5.exercise9;

public class Data {
    public Data() {
        System.out.println("No arg constructor");
    }

    public Data(int x) {
        this();
    }

    public static void main(String[] args) {
        new Data(7);
    }
}
