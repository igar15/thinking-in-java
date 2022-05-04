package ru.javaprojects.thinkinginjava.chapter3.exercise6;

import ru.javaprojects.thinkinginjava.chapter3.exercise5.DogSpeaking.Dog;

public class DogEqualityTest {
    public static void main(String[] args) {
        Dog spot = new Dog("Spot", "I am Spot!");
        Dog newDog = spot;
        System.out.println(spot == newDog);
        System.out.println(newDog.equals(spot));
    }
}
