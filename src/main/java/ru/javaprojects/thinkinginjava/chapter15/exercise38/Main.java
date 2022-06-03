package ru.javaprojects.thinkinginjava.chapter15.exercise38;

public class Main {
    public static void printCoffeeRecept(Coffee coffee) {
        coffee.getDescription();
    }

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        printCoffeeRecept(coffee);
        printCoffeeRecept(new Capuccino(coffee));
    }
}
