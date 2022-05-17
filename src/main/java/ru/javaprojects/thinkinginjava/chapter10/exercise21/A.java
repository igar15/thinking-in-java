package ru.javaprojects.thinkinginjava.chapter10.exercise21;

public class A {
    public U getU() {
        return new U() {
            @Override
            public void a() {
                System.out.println("A-a");
            }

            @Override
            public void b() {
                System.out.println("A-b");
            }

            @Override
            public void c() {
                System.out.println("A-c");
            }
        };
    }
}
