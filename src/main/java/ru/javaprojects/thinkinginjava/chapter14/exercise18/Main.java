package ru.javaprojects.thinkinginjava.chapter14.exercise18;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("ru.javaprojects.thinkinginjava.chapter14.exercise18.MyClass");
        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
    }
}
