package ru.javaprojects.thinkinginjava.chapter12.exercise20_29;

public class StormyInning extends Inning {

    @Override
    public void f() {
        System.out.println("f method");
    }

    public void g() {
        System.out.println("g method");
    }

    public static void main(String[] args) {
        StormyInning stormyInning = new StormyInning();
        stormyInning.f();
        stormyInning.g();

        Inning i = stormyInning;
        i.f();
    }
}
