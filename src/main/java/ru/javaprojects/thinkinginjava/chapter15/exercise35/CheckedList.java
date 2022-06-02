package ru.javaprojects.thinkinginjava.chapter15.exercise35;

import ru.javaprojects.thinkinginjava.chapter15.extends_super.Apple;
import ru.javaprojects.thinkinginjava.chapter15.extends_super.Orange;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckedList {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        addOrange(apples);

        List<Apple> checkedList = Collections.checkedList(apples, Apple.class);
        addOrange(checkedList);
    }

    public static void addOrange(List list) {
        list.add(new Orange());
    }
}
