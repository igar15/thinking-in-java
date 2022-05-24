package ru.javaprojects.thinkinginjava.chapter12.exercise4_8;

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyException("in main");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
