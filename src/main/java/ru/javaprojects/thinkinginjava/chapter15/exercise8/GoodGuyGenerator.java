package ru.javaprojects.thinkinginjava.chapter15.exercise8;

import java.util.Random;

public class GoodGuyGenerator implements Generator<GoodGuy> {
    private String[] names = {"Batman", "Spider-man"};
    private Random random = new Random();

    @Override
    public GoodGuy next() {
        return new GoodGuy(names[random.nextInt(names.length)]);
    }

}
