package ru.javaprojects.thinkinginjava.chapter17.exercise27;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<CountedString> set = new HashSet<>();
        set.add(new CountedString("1"));
        set.add(new CountedString("1"));
        set.add(new CountedString("1"));
        for (CountedString countedString : set) {
            System.out.println(countedString.hashCode());
        }
        System.out.println(set);
    }
}
