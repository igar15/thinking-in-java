package ru.javaprojects.thinkinginjava.chapter9.exercise9_10;

public class Percussion extends Instrument implements Playable {
    @Override
    public void play(Note note) {
        System.out.println("Percussion plays note " + note);
    }

    @Override
    public void adjust() {
        System.out.println("Percussion adjusts");
    }
}
