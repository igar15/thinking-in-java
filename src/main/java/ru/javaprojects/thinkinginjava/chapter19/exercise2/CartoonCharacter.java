package ru.javaprojects.thinkinginjava.chapter19.exercise2;

import java.util.Random;

public enum CartoonCharacter {
    BOB, SPANKY, TRAVIS;

    private  static Random random = new Random();
    public static CartoonCharacter next() {
        return CartoonCharacter.values()[random.nextInt(values().length)];
    }
}
