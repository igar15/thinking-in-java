package ru.javaprojects.thinkinginjava.chapter8.exercise11;

public class Sandwich extends Lunch{
    private Bread bread = new Bread();
    private Cheese cheese = new Cheese();
    private Letucke letucke = new Letucke();
    private Pickle pickle = new Pickle();

    public Sandwich() {
        System.out.println("Sandwich");
    }

    public static void main(String[] args) {
        new Sandwich();
    }
}
