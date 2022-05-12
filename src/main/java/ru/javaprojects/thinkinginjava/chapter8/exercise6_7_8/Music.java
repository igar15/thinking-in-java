package ru.javaprojects.thinkinginjava.chapter8.exercise6_7_8;

import java.util.Random;

public class Music {
    private static Random random = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            tune(get());
        }
    }

    public static void tune(Instrument instrument) {
        instrument.play(Note.RE);
    }

    public static Instrument get() {
        int value = random.nextInt(3);
        switch (value) {
            case 0:
                return new Guitar();
            case 1:
                return new Wind();
            case 2:
                return new Brass();
            default:
                return null;
        }
    }
}
