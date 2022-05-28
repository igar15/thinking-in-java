package ru.javaprojects.thinkinginjava.chapter14.exercise14;

import java.util.List;
import java.util.Random;

public class PartTest {
    private static List<Class<? extends Part>> partTypes = List.of(OilFilter.class, GeneratorBelt.class);

    public static Part getRandomPart() {
        Random random = new Random();
        int partTypeIndex = random.nextInt(partTypes.size());
        return createPart(partTypes.get(partTypeIndex));
    }

    private static Part createPart(Class<? extends Part> clazz) {
        try {
            return clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
