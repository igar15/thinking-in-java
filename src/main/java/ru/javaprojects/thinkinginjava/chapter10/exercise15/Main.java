package ru.javaprojects.thinkinginjava.chapter10.exercise15;

public class Main {
    public static void main(String[] args) {
        playGame(Coin.factory);
        playGame(Dice.factory);
    }

    public static void playGame(RollableFactory factory) {
        factory.getRollGame().roll();
    }
}
