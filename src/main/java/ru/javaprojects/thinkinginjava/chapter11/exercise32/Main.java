package ru.javaprojects.thinkinginjava.chapter11.exercise32;

import ru.javaprojects.thinkinginjava.chapter11.exercise30.Pet;

public class Main {
    public static void main(String[] args) {
        PetSequence petSequence = new PetSequence();
        for (Pet pet : petSequence.iterator()) {
            System.out.println(pet);
        }
        System.out.println();
        for (Pet pet : petSequence.reversed()) {
            System.out.println(pet);
        }
        System.out.println();
        for (Pet pet : petSequence.random()) {
            System.out.println(pet);
        }
    }
}
