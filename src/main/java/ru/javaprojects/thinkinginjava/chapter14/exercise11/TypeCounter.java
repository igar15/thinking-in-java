package ru.javaprojects.thinkinginjava.chapter14.exercise11;

import java.util.HashMap;
import java.util.Map;

public class TypeCounter {
    private Class<?> baseType;
    private Map<Class<?>, Integer> counter = new HashMap<>();

    public TypeCounter(Class<?> baseType) {
        this.baseType = baseType;
    }

    public void count(Class<?> clazz) {
        if (baseType.isAssignableFrom(clazz)) {
            counter.merge(clazz, 1, Integer::sum);
        } else {
            throw new IllegalArgumentException("clazz must be subclass of " + baseType.getSimpleName());
        }
    }

    public void printInfo() {
        counter.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
