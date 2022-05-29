package ru.javaprojects.thinkinginjava.chapter14.exercise26;

public class Piano extends Instrument {
    @Override
    public void play() {
        System.out.println("Piano plays");
    }

    @Override
    public void prepareInstrument() {
        System.out.println("Prepare piano");
    }
}
