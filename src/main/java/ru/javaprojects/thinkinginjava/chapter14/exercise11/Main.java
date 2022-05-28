package ru.javaprojects.thinkinginjava.chapter14.exercise11;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pet> pets = PetGenerator.getPets(20);
        TypeCounter typeCounter = new TypeCounter(Pet.class);
        pets.forEach(p -> typeCounter.count(p.getClass()));
        typeCounter.printInfo();
    }
}
