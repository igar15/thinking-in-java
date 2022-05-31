package ru.javaprojects.thinkinginjava.chapter15.exercise13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Generators.fill(new ArrayList<>(), new IntGenerator(100), 10);
        System.out.println(list);
        Set<Integer> set = Generators.fill(new HashSet<>(), new IntGenerator(50), 10);
        System.out.println(set);
    }
}
