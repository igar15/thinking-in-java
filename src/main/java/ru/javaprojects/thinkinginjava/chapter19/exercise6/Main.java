package ru.javaprojects.thinkinginjava.chapter19.exercise6;

public class Main {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3};
        for (int i : ints) {
            if (i == 2) {
                return;
            }
            System.out.println(i);
        }
    }
}
