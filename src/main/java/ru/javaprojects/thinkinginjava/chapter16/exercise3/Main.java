package ru.javaprojects.thinkinginjava.chapter16.exercise3;

public class Main {
    public static void main(String[] args) {
        double[][] doubles = ArrayGenerator.generateArray(10, 2, 3.5, 10.5);
        ArrayGenerator.printArray(doubles);
    }
}
