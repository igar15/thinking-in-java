package ru.javaprojects.thinkinginjava.chapter9.exercise1;

public class Hamster extends Rodent {
    @Override
    public void makeNoise() {
        System.out.println("Fr-fr");
    }

    @Override
    public void findFood() {
        System.out.println("Hamster finds food");
    }
}
