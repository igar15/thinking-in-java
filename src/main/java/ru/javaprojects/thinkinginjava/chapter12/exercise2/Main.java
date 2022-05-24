package ru.javaprojects.thinkinginjava.chapter12.exercise2;

public class Main {
    public static void main(String[] args) {
        Object o = null;
        try {
            o.toString();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
