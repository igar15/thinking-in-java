package ru.javaprojects.thinkinginjava.chapter2.exercise1;

public class NotInitializedFields {
    private int i;
    private char c;

    public static void main(String[] args) {
        NotInitializedFields nif = new NotInitializedFields();
        System.out.println(nif.i);
        System.out.println(nif.c);
    }
}