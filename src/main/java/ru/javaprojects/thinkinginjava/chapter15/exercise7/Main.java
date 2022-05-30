package ru.javaprojects.thinkinginjava.chapter15.exercise7;

public class Main {
    public static void main(String[] args) {
        FibonacciIterableAdapter fibonacciIterableAdapter = new FibonacciIterableAdapter(10);
        for (int f : fibonacciIterableAdapter) {
            System.out.println(f);
        }
    }
}
