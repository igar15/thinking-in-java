package ru.javaprojects.thinkinginjava.chapter10.exercise15;

import java.util.Random;

public class Dice implements Rollable {
    private Random random = new Random();

    @Override
    public void roll() {
        int value = random.nextInt(6);
        switch (value) {
            case 0:
                System.out.println("Dice: 1");
                break;
            case 1:
                System.out.println("Dice: 2");
                break;
            case 2:
                System.out.println("Dice: 3");
                break;
            case 3:
                System.out.println("Dice: 4");
                break;
            case 4:
                System.out.println("Dice: 5");
                break;
            case 5:
                System.out.println("Dice: 6");
                break;
        }
    }

    public static RollableFactory factory = new RollableFactory() {
        @Override
        public Rollable getRollGame() {
            return new Dice();
        }
    };
}
