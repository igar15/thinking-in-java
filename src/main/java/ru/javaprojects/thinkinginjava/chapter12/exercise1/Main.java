package ru.javaprojects.thinkinginjava.chapter12.exercise1;

public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("in main method");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("in finally");
        }
    }
}
