package ru.javaprojects.thinkinginjava.chapter9.exercise3;

public class IntPrinter extends Printer {
    private int i = 10;

    @Override
    public void print() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        new IntPrinter().print();
    }
}
