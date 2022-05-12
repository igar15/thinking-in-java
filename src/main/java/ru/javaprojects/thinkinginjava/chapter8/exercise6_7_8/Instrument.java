package ru.javaprojects.thinkinginjava.chapter8.exercise6_7_8;

public abstract class Instrument {
    public abstract void play(Note n);

    public abstract String what();

    @Override
    public String toString() {
        return what();
    }
}
