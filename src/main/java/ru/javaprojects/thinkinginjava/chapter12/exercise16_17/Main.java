package ru.javaprojects.thinkinginjava.chapter12.exercise16_17;

public class Main {
    public static void main(String[] args) {
        doSm(10);
    }

    public static void doSm(int x) {
        try {
            System.out.println("First part of job");
            if (x == 10) {
                System.out.println("Error");
                return;
            }
            System.out.println("Second part of job");
        } finally {
            System.out.println("Do work for cleaning");
        }
    }
}
