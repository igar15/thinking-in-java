package ru.javaprojects.thinkinginjava.chapter16.exercise15;

import ru.javaprojects.thinkinginjava.chapter15.exercise13.Generator;
import ru.javaprojects.thinkinginjava.chapter16.exercise1.BerilliumSphere;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Generator<BerilliumSphere> generator = BerilliumSphere::new;
        BerilliumSphere[] berilliumSpheres = new BerilliumSphere[5];
        Generated.fillArray(berilliumSpheres, generator);
        System.out.println(Arrays.toString(berilliumSpheres));
    }
}
