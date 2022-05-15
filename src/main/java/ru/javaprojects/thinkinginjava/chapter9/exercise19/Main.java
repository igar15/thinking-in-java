package ru.javaprojects.thinkinginjava.chapter9.exercise19;

public class Main {
    public static void main(String[] args) {
        Rollable rollGame = RollFactory.getRollGame(RollGame.COIN);
        rollGame.roll();
        rollGame = RollFactory.getRollGame(RollGame.DICE);
        rollGame.roll();
    }
}
