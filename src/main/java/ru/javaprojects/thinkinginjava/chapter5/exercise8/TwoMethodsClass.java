package ru.javaprojects.thinkinginjava.chapter5.exercise8;

public class TwoMethodsClass {
    public void a() {
        System.out.println("in a body");
        b();
        this.b();
    }

    public void b() {
        System.out.println("in b body");
    }

    public static void main(String[] args) {
        new TwoMethodsClass().a();
    }
}
