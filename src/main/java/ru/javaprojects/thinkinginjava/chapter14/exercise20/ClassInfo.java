package ru.javaprojects.thinkinginjava.chapter14.exercise20;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassInfo {
    public static void printInfo(String className) throws ClassNotFoundException {
        Class<?> clazz = Class.forName(className);
        System.out.println("Methods:");
        for (Method method : clazz.getMethods()) {
            System.out.println(method);
        }
        System.out.println("---------------------");
        System.out.println("Constructors:");
        for (Constructor constructor : clazz.getConstructors()) {
            System.out.println(constructor);
        }
        System.out.println("---------------------");
        System.out.println("Fields:");
        for (Field field : clazz.getFields()) {
            System.out.println(field);
        }
        System.out.println("---------------------");
    }
}
