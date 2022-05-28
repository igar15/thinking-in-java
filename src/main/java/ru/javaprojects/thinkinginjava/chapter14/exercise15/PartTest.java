package ru.javaprojects.thinkinginjava.chapter14.exercise15;

import java.util.List;
import java.util.Random;

public class PartTest {
    private static List<Factory<? extends Part>> partFactories = List.of(new OilFilter.OilFilterFactory(), new GeneratorBelt.GeneratorBeltFactory());

    public static Part getRandomPart() {
        Random random = new Random();
        int partFactoryIndex = random.nextInt(partFactories.size());
        return partFactories.get(partFactoryIndex).createInstance();
    }
}
