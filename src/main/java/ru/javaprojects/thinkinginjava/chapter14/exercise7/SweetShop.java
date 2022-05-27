package ru.javaprojects.thinkinginjava.chapter14.exercise7;

public class SweetShop {
    public static void main(String[] args) throws ClassNotFoundException {
        if (args.length == 1) {
            Class.forName(args[0]);
        }
    }
}
