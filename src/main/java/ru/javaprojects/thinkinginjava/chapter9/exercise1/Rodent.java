package ru.javaprojects.thinkinginjava.chapter9.exercise1;

public abstract class Rodent {
    public abstract void makeNoise();

    public void eat(){
        System.out.println("Rodent eats");
    }

    public abstract void findFood();
}
