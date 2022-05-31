package ru.javaprojects.thinkinginjava.chapter15.exercise14;

import ru.javaprojects.thinkinginjava.chapter15.exercise13.Generator;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BasicGenerator<T> implements Generator<T> {
    private Class<T> clazz;

    public BasicGenerator(Class<T> clazz) {
        this.clazz = clazz;
    }

    @Override
    public T next() {
        return createInstance();
    }

    private T createInstance() {
        try {
            Constructor<T> constructor = clazz.getConstructor();
            return constructor.newInstance();
        } catch (InstantiationException | InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> BasicGenerator<T> create(Class<T> clazz) {
        return new BasicGenerator<>(clazz);
    }
}
