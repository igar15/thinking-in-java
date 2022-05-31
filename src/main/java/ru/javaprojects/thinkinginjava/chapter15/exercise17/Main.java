package ru.javaprojects.thinkinginjava.chapter15.exercise17;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        EnumSet<Colors> range = EnumSet.range(Colors.BLACK, Colors.YELLOW);
        Set<?> check = check(range);
    }

    public static Set<?> check(Set<?> set) {
        if (set instanceof EnumSet) {
            return ((EnumSet) set).clone();
        } else {
            return new HashSet<>(set);
        }
    }
}
