package ru.javaprojects.thinkinginjava.chapter7.exercise19;

public class Example {
    private final String s;
    private static final String SS;

    static {
        SS = "888";
    }

    public Example(String s) {
        this.s = s;
    }

    public Example() {
        s = "123";
    }

    public static void main(String[] args) {
        System.out.println(new Example("456").s);
        System.out.println(new Example().s);
//        new Example().s = "111";
    }
}
