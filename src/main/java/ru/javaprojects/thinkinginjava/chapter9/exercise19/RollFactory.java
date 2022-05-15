package ru.javaprojects.thinkinginjava.chapter9.exercise19;

public class RollFactory {
    public static Rollable getRollGame(RollGame rollGame) {
        switch (rollGame) {
            case COIN:
                return new Coin();
            case DICE:
                return new Dice();
            default:
                throw new IllegalArgumentException("Unknown game");
        }
    }
}