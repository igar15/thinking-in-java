package ru.javaprojects.thinkinginjava.chapter17.exercise3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> countries = new HashSet<>();
        fillSet(countries);
        countries = new LinkedHashSet();
        fillSet(countries);
        countries = new TreeSet<>();
        fillSet(countries);
    }

    private static void fillSet(Set<String> countries) {
        countries.add("America");
        countries.add("England");
        countries.add("Russia");
        countries.add("America");
        countries.add("England");
        countries.add("Russia");
        countries.add("America");
        countries.add("England");
        countries.add("Russia");
        System.out.println(countries);
    }
}
