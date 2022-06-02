package ru.javaprojects.thinkinginjava.chapter15.exercise33;

public class Main {
    public static void main(String[] args) {
        FixedSizeStack<Integer> fixedSizeStack = new FixedSizeStack<>(10);
        for (int i = 0; i < 20; i++) {
            fixedSizeStack.push(i);
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(fixedSizeStack.pop());
        }
    }
}
