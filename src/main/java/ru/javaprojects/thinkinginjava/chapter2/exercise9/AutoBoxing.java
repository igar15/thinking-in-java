package ru.javaprojects.thinkinginjava.chapter2.exercise9;

public class AutoBoxing {
    public static void main(String[] args) {
        int i = 10;
        Integer x = i;
        System.out.println(x);
        i = x;
        System.out.println(i);
    }
}
