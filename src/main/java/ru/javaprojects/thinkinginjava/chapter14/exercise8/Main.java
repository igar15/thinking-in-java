package ru.javaprojects.thinkinginjava.chapter14.exercise8;

import ru.javaprojects.thinkinginjava.chapter14.exercise3_4_5_6.Rhomboid;

public class Main {
    public static void showHierarchy(Object o) {
        Class<?> clazz = o.getClass();
        System.out.println(clazz.getSimpleName());
        while (clazz != Object.class) {
            clazz = clazz.getSuperclass();
            System.out.println(clazz.getSimpleName());
        }
    }

    public static void main(String[] args) {
        showHierarchy(new Rhomboid());
    }
}
