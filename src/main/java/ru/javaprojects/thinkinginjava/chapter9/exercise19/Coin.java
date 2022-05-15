package ru.javaprojects.thinkinginjava.chapter9.exercise19;

import java.util.Random;

public class Coin implements Rollable {
    private Random random = new Random();

    @Override
    public void roll() {
        int value = random.nextInt(2);
        System.out.println(value == 0 ? "Eagle" : "Tails");
    }
}
