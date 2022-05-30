package ru.javaprojects.thinkinginjava.chapter15.exercise1;

public class Main {
    public static void main(String[] args) {
        Holder<Pet> holder = new Holder<>(new Cat());
        System.out.println(holder.getValue());
        holder.setValue(new Dog());
        System.out.println(holder.getValue());
    }
}
