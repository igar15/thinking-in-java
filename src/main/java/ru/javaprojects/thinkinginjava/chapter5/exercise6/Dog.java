package ru.javaprojects.thinkinginjava.chapter5.exercise6;

public class Dog {
    public void bark(int i, byte b) {
        System.out.println("first int, then byte");
    }

    public void bark(byte b, int i) {
        System.out.println("first byte, then int");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark((byte) 20, 20);
        dog.bark(20, (byte) 20);
    }
}
