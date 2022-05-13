package ru.javaprojects.thinkinginjava.chapter9.exercise9_10;

public class Wind extends Instrument implements Playable {
    @Override
    public void play(Note note) {
        System.out.println("Wind plays note " + note);
    }

    @Override
    public void adjust() {
        System.out.println("Wind adjusts");
    }
}
