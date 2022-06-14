package ru.javaprojects.thinkinginjava.chapter17.remove_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("a");
        words.add("a");
        words.add("a");
        words.add("a");
        words.add("a");
        words.add("b");
        words.remove("a");
        System.out.println(words);
        words.removeAll(new ArrayList<>(Arrays.asList("a", "b")));
        System.out.println(words);
    }
}
