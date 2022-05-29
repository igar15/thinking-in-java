package ru.javaprojects.thinkinginjava.chapter14.exercise26;

public class Wind extends Instrument {
    @Override
    public void play() {
        System.out.println("Wind plays");
    }

    @Override
    public void prepareInstrument() {
        clearSpitValve();
    }

    private void clearSpitValve() {
        System.out.println("Clear spit valve");
    }
}
