package ru.javaprojects.thinkinginjava.chapter14.exercise10;

public class Main {
    public static void main(String[] args) {
        char[] chars = {'u', 'i'};
        Class<? extends char[]> clazz = chars.getClass();
        Class<?> superclass = clazz.getSuperclass();
        System.out.println(superclass == Object.class);
    }
}
