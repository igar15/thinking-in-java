package ru.javaprojects.thinkinginjava.chapter16.exercise4;

public class Main {
    public static void main(String[] args) {
        double[][][] doubles = ArrayGenerator.generateArray(3, 2, 2, 3.5, 9.2);
        ArrayGenerator.printArray(doubles);
    }
}
