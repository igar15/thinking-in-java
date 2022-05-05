package ru.javaprojects.thinkinginjava.chapter4.exercise23;

public class FibonacciFinder {
    public static void main(String[] args) {
        printFibonacciNumbers(10);
    }

    public static void printFibonacciNumbers(int amount) {
        if (amount < 1) {
            throw new IllegalArgumentException("amount must be greater than 0");
        }
        if (amount == 1) {
            System.out.println("1");
        } else if (amount == 2) {
            System.out.println("1, 1");
        } else {
            int prePreviousFibNumber = 1;
            int previousFibNumber = 1;
            System.out.print(prePreviousFibNumber + ", " + previousFibNumber);
            for (int fibNumbersCounter = 2; fibNumbersCounter < amount; fibNumbersCounter++) {
                int currentFibNumber = previousFibNumber + prePreviousFibNumber;
                System.out.print(", " + currentFibNumber);
                prePreviousFibNumber = previousFibNumber;
                previousFibNumber = currentFibNumber;
            }
        }
    }
}
