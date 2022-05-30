package ru.javaprojects.thinkinginjava.chapter15.exercise2;

public class Main {
    public static void main(String[] args) {
        ThreeHolder<String> threeHolder = new ThreeHolder<>("1", "2", "3");
        System.out.println(threeHolder);
        System.out.println(threeHolder.getValue2());
        threeHolder.setValue3("99");
        System.out.println(threeHolder);
    }
}
