package ru.javaprojects.thinkinginjava.chapter15.exercise28;

public class Main {
    public static void main(String[] args) {
        Generic2<Apple> generic2 = new Generic2<>(new Apple());
        generic2.work(new Generic1<>());
    }
}
