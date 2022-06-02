package ru.javaprojects.thinkinginjava.chapter15.exercise32;

public class Main {
    public static void main(String[] args) {
        FixedSizeStack<Integer> fixedSizeStack = new FixedSizeStack<>(10);
        for (int i = 0; i < 11; i++) {
            fixedSizeStack.push(i);
        }
    }
}
