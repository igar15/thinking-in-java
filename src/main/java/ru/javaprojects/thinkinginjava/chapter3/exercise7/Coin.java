package ru.javaprojects.thinkinginjava.chapter3.exercise7;

import java.util.Random;

public class Coin {
    private Random random = new Random();

    public void throwCoin() {
        int number = random.nextInt(2);
        System.out.println("Throw a coin. Result is " + (number == 0 ? "Eagle" : "Tails"));
    }

    public static void main(String[] args) {
        Coin coin = new Coin();
        for (int i = 0; i < 3; i++) {
            coin.throwCoin();
        }
    }
}
