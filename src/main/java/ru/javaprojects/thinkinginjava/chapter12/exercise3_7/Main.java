package ru.javaprojects.thinkinginjava.chapter12.exercise3_7;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"1"};
        try {
            System.out.println(strings[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
