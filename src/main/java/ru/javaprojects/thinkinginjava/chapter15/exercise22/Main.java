package ru.javaprojects.thinkinginjava.chapter15.exercise22;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static Object createObject(Class<?> objectType, Object... parameters) {
        int x = 10;
        Class<?>[] parameterTypes = new Class[parameters.length];
        for (int i = 0; i < parameters.length; i++) {
            parameterTypes[i] = parameters[i].getClass();
        }
        return createInstance(objectType, parameterTypes, parameters);
    }

    private static Object createInstance(Class<?> objectType, Class<?>[] parameterTypes, Object[] parameters) {
        try {
            Constructor<?> constructor = objectType.getConstructor(parameterTypes);
            return constructor.newInstance(parameters);
        } catch (InstantiationException | InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Object abc = createObject(Data.class, "abc", 11);
        System.out.println(abc);
    }
}
