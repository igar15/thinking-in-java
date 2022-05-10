package ru.javaprojects.thinkinginjava.chapter5.exercise13;

public class StaticTest {


    public static void main(String[] args) {
        System.out.println(Inner.i);
        new Inner();
    }

    private static class Inner {
        private static int i;
        static {
            i = 47;
            System.out.println("In inner static block");
        }
    }
}
