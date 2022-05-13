package ru.javaprojects.thinkinginjava.chapter9.exercise1;

public class Mouse extends Rodent {
    @Override
    public void makeNoise() {
        System.out.println("Pi-pi");
    }

    @Override
    public void findFood() {
        System.out.println("Mouse finds food");
    }
}
