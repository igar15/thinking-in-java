package ru.javaprojects.thinkinginjava.chapter2.exercise10;

public class ArgsPrinter {
    public static void main(String[] args) {
        if (args.length >= 3) {
            System.out.println(args[0]);
            System.out.println(args[1]);
            System.out.println(args[2]);
        }
    }
}