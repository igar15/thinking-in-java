package ru.javaprojects.thinkinginjava.chapter15.exercise8;

import java.util.Random;

public class BadGuyGenerator implements Generator<BadGuy> {
    private String[] names = {"Goblin", "Venom", "Joker"};
    private Random random = new Random();

    @Override
    public BadGuy next() {
        return new BadGuy(names[random.nextInt(names.length)]);
    }
}
