package ru.javaprojects.thinkinginjava.chapter10.exercise15;

import java.util.Random;

public class Coin implements Rollable {
    private Random random = new Random();

    @Override
    public void roll() {
        int value = random.nextInt(2);
        System.out.println(value == 0 ? "Eagle" : "Tails");
    }

    public static RollableFactory factory = new RollableFactory() {
        @Override
        public Rollable getRollGame() {
            return new Coin();
        }
    };
}
