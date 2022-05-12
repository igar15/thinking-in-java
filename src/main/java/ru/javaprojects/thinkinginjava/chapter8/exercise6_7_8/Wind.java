package ru.javaprojects.thinkinginjava.chapter8.exercise6_7_8;

public class Wind extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Wind plays note " + n);
    }

    @Override
    public String what() {
        return "Wind";
    }
}
