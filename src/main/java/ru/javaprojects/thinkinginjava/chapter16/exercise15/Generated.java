package ru.javaprojects.thinkinginjava.chapter16.exercise15;

import ru.javaprojects.thinkinginjava.chapter15.exercise13.Generator;

import java.lang.reflect.Array;

public class Generated {
    public static <T> void fillArray(T[] array, Generator<T> generator) {
        for (int i = 0; i < array.length; i++) {
            array[i] = generator.next();
        }
    }

    public static <T> T[] generateArray(Class<T> type, Generator<T> generator, int size) {
        T[] array = (T[]) Array.newInstance(type, size);
        for (int i = 0; i < array.length; i++) {
            array[i] = generator.next();
        }
        return array;
    }
}
