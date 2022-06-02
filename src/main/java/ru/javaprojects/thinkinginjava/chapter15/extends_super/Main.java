package ru.javaprojects.thinkinginjava.chapter15.extends_super;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void checkExtends(List<? extends Fruit> fruits) {
//        fruits.add(new Orange());
//        fruits.add(new Fruit());
//        fruits.add(new Apple());
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }
    }

    public static void checkSuper(List<? super Fruit> list) {
        list.add(new Apple());
        list.add(new Orange());
        list.add(new Fruit());
//        list.add(new Object());
        for (Object fruit : list) {
            System.out.println(fruit);
        }
    }

    public static void main(String[] args) {
        List<Fruit> fruits = Arrays.asList(new Apple(), new Orange());
        checkExtends(fruits);
        List<Apple> apples = Arrays.asList(new Apple());
        checkExtends(apples);
//        checkExtends(new ArrayList<Object>());

//        checkSuper(apples);
        List<Fruit> modifiableFruits = new ArrayList<>(fruits);
        checkSuper(modifiableFruits);
        List<Object> objects = new ArrayList<>();
        checkSuper(objects);
    }
}
