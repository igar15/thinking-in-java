package ru.javaprojects.thinkinginjava.chapter17.exercise24;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new SimpleHashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        System.out.println(set);
        System.out.println(set.size());
    }
}
