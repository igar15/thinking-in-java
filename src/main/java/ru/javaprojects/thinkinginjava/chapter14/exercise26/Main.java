package ru.javaprojects.thinkinginjava.chapter14.exercise26;

public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[]{new Piano(), new Wind()};
        for (Instrument i : instruments) {
            i.prepareInstrument();
            i.play();
        }
    }
}
