package ru.javaprojects.thinkinginjava.chapter5.exercise5;

public class Dog {
    public void bark(byte b) {
        System.out.println("Bark with bytes");
    }

    public void bark(short s) {
        System.out.println("Bark with shorts");
    }

    public void bark(int i) {
        System.out.println("Bark with ints");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark((byte) 20);
        dog.bark((short) 20);
        dog.bark(20);
    }
}
