package ru.javaprojects.thinkinginjava.chapter14.exercise15;

public class Main {
    public static void main(String[] args) {
        Part randomPart = PartTest.getRandomPart();
        System.out.println(randomPart);
        randomPart = PartTest.getRandomPart();
        System.out.println(randomPart);
    }
}
