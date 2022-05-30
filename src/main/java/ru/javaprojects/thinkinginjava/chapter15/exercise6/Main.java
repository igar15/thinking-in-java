package ru.javaprojects.thinkinginjava.chapter15.exercise6;

public class Main {
    public static void main(String[] args) {
        RandomList<Integer> randomList = new RandomList<>();
        for (int i = 0; i < 10; i++) {
            randomList.add(i);
        }
        System.out.println(randomList.select());
        System.out.println(randomList.select());
        System.out.println(randomList.select());
    }
}
