package ru.javaprojects.thinkinginjava.chapter2.exercise8;

public class SomeObject {
    public static int i = 0;

    public static void main(String[] args) {
        SomeObject so1 = new SomeObject();
        SomeObject so2 = new SomeObject();
        SomeObject so3 = new SomeObject();
        so1.i = 10;
        so2.i = 15;
        so3.i = 20;
        System.out.println(so1.i == 20);
        System.out.println(so2.i == 20);
        System.out.println(so3.i == 20);
    }
}
