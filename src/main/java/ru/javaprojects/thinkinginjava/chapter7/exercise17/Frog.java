package ru.javaprojects.thinkinginjava.chapter7.exercise17;

import ru.javaprojects.thinkinginjava.chapter7.exercise16.Amphibian;

public class Frog extends Amphibian {
    @Override
    public void swim() {
        System.out.println("Frog swims");
    }

    @Override
    public void jump() {
        System.out.println("Frog jumps");
    }
}
