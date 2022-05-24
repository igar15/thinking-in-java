package ru.javaprojects.thinkinginjava.chapter12.exercise9_13;

public class Thrower {
    public static void makeEx(int x) throws Ex1, Ex2, Ex3 {
        if (x == 0) {
            throw new Ex1();
        } else if (x == 1) {
            throw new Ex2();
        } else if (x == 2) {
            throw new NullPointerException();
        }
        throw new Ex3();
    }

    public static void main(String[] args) {
        try {
            makeEx(2);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("in finally");
        }
    }
}
