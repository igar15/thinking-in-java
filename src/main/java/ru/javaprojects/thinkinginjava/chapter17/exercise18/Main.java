package ru.javaprojects.thinkinginjava.chapter17.exercise18;

import java.util.Arrays;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new SlowSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("3");
        System.out.println(set);
        System.out.println(set.isEmpty());
        System.out.println(set.remove("1"));
        System.out.println(set);
        System.out.println(set.contains("2"));
        System.out.println(set.addAll(Arrays.asList("4", "5")));
        System.out.println(set);
        System.out.println(Arrays.asList(set.toArray()));
    }
}
