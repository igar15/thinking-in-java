package ru.javaprojects.thinkinginjava.chapter14.exercise1_2_19;

public class Toy {
    private int x;

    public Toy() {

    }

    public Toy(int x) {
        this.x = x;
        System.out.println(x);
    }

    @Override
    public String toString() {
        return "Toy:" + x;
    }
}
