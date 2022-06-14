package ru.javaprojects.thinkinginjava.chapter17.exercise10;

import java.util.SortedSet;

public class Main {
    public static void main(String[] args) {
        SortedSet<Integer> set = new MySortedSet<>();
        set.add(10);
        set.add(5);
        set.add(20);
        set.add(3);
        set.add(1);
        set.add(0);
        System.out.println(set);
        System.out.println(set.subSet(3, 20));
        System.out.println(set.headSet(10));
        System.out.println(set.tailSet(3));
    }
}
