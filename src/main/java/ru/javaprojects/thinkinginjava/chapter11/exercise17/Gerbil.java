package ru.javaprojects.thinkinginjava.chapter11.exercise17;

public class Gerbil {
    private int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public int hop() {
        System.out.println("Hop");
        return gerbilNumber;
    }
}
