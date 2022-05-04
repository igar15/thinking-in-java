package ru.javaprojects.thinkinginjava.chapter4.exercise18;

public class PrimesFinder {

    public static void findPrimes(int upperBound) {
        for (int number = 2; number < upperBound; number++) {
            boolean isPrime = true;
            for (int divider = 2; divider < number; divider++) {
                if (number % divider == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
        findPrimes(100);
    }
}
