package ru.javaprojects.thinkinginjava.chapter13.exercise6;

public class Data {
    private int a;
    private long b;
    private float c;
    private double d;

    public Data(int a, long b, float c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public String toString() {
        return String.format("a=%05d, b=%05d, c=%05.2f, d=%05.2f", a, b, c, d);
    }

    public static void main(String[] args) {
        System.out.println(new Data(10, 100, 2.5f, 3.2));
    }
}
