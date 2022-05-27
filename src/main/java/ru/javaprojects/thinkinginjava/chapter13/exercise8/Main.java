package ru.javaprojects.thinkinginjava.chapter13.exercise8;

import java.util.Arrays;

public class Main {
    public static final String KNIGHTS = "Then, when you have found the shrubbery, " +
            "you must cut down the mightiest tree in the forest... with... a herring!";

    public static void main(String[] args) {
        String[] strings = KNIGHTS.split("the");
        System.out.println(Arrays.toString(strings));
    }
}
