package ru.javaprojects.thinkinginjava.chapter9.exercise9_10;

public class Music {
    public static void main(String[] args) {
        Playable[] playables = new Playable[]{new Wind(), new Percussion()};
        for (Playable p : playables) {
            tune(p);
        }
    }

    public static void tune(Playable playable) {
        playable.play(Note.DO);
    }
}
