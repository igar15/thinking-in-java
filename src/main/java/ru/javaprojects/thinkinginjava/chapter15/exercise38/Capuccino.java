package ru.javaprojects.thinkinginjava.chapter15.exercise38;

public class Capuccino extends Coffee {
    private Coffee coffee;

    public Capuccino(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("and capuccino staff");
    }
}
