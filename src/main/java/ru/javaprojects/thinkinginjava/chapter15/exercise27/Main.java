package ru.javaprojects.thinkinginjava.chapter15.exercise27;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
//        List<Number> numbers = integers;
        List<? extends Number> numbers = integers;
    }
}
