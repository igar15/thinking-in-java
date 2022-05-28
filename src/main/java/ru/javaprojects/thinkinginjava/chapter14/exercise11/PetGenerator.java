package ru.javaprojects.thinkinginjava.chapter14.exercise11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PetGenerator {
    private static List<Class<? extends Pet>> petTypes;

    static {
        petTypes = List.of(Dog.class, Cat.class, Buldog.class, Brit.class);
    }

    public static List<Pet> getPets(int amount) {
        Random random = new Random();
        List<Pet> pets = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            int petTypeIndex = random.nextInt(petTypes.size());
            pets.add(createPet(petTypes.get(petTypeIndex)));
        }
        return pets;
    }

    private static Pet createPet(Class<? extends Pet> clazz) {
        try {
            return clazz.newInstance();
        } catch (IllegalAccessException | InstantiationException exception) {
            throw new RuntimeException(exception);
        }
    }
}
