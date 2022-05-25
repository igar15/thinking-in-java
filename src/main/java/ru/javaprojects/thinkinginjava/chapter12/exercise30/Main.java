package ru.javaprojects.thinkinginjava.chapter12.exercise30;

public class Main {
    public static void main(String[] args) {
        try {
            new Human().doSm(0);
        } catch (Ex2 ex2) {
            ex2.printStackTrace();
        } catch (Ex1 ex1) {
            ex1.printStackTrace();
        }
    }
}
