package ru.javaprojects.thinkinginjava.chapter4.exercise17;

import ru.javaprojects.thinkinginjava.chapter4.exercise16.NumberGenerator;

public class EndlessNumberGenerator {
    public static void main(String[] args) {
        while (true) {
            NumberGenerator.generateAndCompareNumbers();
        }
    }
}
