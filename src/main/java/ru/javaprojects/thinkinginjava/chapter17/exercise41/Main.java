package ru.javaprojects.thinkinginjava.chapter17.exercise41;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<TwoString> set = new HashSet<>();
        set.add(new TwoString("1", "1"));
        System.out.println(set.contains(new TwoString("1", "1")));
    }
}
