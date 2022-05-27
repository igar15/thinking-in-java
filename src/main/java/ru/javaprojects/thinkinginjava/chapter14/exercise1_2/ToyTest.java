package ru.javaprojects.thinkinginjava.chapter14.exercise1_2;

import java.util.Arrays;

public class ToyTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> clazz = Class.forName("ru.javaprojects.thinkinginjava.chapter14.exercise1_2.FancyToy");
        Object o = clazz.newInstance();
        Class<?>[] interfaces = clazz.getInterfaces();
        System.out.println(Arrays.toString(interfaces));
    }
}
