package ru.javaprojects.thinkinginjava.chapter15.exercise38;

public class Mokka extends Coffee {
    private Coffee coffee;

    public Mokka(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("and mokka staff");
    }
}
