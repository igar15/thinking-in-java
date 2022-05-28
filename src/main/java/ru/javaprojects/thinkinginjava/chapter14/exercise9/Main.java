package ru.javaprojects.thinkinginjava.chapter14.exercise9;

import ru.javaprojects.thinkinginjava.chapter14.exercise3_4_5_6.Rhomboid;

import java.lang.reflect.Field;

public class Main {
    public static void showHierarchy(Object o) {
        Class<?> clazz = o.getClass();
        showFields(clazz);
        System.out.println(clazz.getSimpleName());
        while (clazz != Object.class) {
            clazz = clazz.getSuperclass();
            showFields(clazz);
            System.out.println(clazz.getSimpleName());
        }
    }

    public static void main(String[] args) {
        showHierarchy(new Rhomboid());
    }

    private static void showFields(Class<?> clazz) {
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }
}
