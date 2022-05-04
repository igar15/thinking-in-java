package ru.javaprojects.thinkinginjava.chapter4.exercise16;

import java.util.Random;

public class NumberGenerator {
    public static Random random = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < 25; i++) {
            generateAndCompareNumbers();
        }
    }

    public static void generateAndCompareNumbers() {
        int number1 = random.nextInt();
        int number2 = random.nextInt();
        if (number1 > number2) {
            System.out.println("number1 > number2");
        } else if (number1 < number2) {
            System.out.println("number1 < number2");
        } else {
            System.out.println("number 1 = number 2");
        }
    }
}
