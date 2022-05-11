package ru.javaprojects.thinkinginjava.chapter7.exercise17;

import ru.javaprojects.thinkinginjava.chapter7.exercise16.Amphibian;

public class MainApp {

    public static void main(String[] args) {
        Amphibian amphibian = new Frog();
        amphibian.swim();
        amphibian.jump();
    }
}