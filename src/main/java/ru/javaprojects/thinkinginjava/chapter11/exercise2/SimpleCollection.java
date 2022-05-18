package ru.javaprojects.thinkinginjava.chapter11.exercise2;

import java.util.Collection;
import java.util.HashSet;

public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> collection = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            collection.add(i);
        }
        for (int i : collection) {
            System.out.print(i + ", ");
        }
    }
}
