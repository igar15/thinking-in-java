package ru.javaprojects.thinkinginjava.chapter17.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        doCountriesWork(countries);
        countries = new LinkedList<>();
        doCountriesWork(countries);
    }

    private static void doCountriesWork(List<String> countries) {
        countries.add("America");
        countries.add("England");
        countries.add("Brasil");
        Collections.sort(countries);
        System.out.println(countries);
        Collections.shuffle(countries);
        System.out.println(countries);
        Collections.shuffle(countries);
        System.out.println(countries);
        Collections.shuffle(countries);
        System.out.println(countries);
    }
}
