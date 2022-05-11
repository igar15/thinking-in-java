package ru.javaprojects.thinkinginjava.chapter7.exercise16;

public class MainApp {
    public static void main(String[] args) {
        Frog frog = new Frog();
        Amphibian amphibian = frog;
        amphibian.jump();
        amphibian.swim();
    }
}
