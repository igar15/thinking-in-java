package ru.javaprojects.thinkinginjava.chapter12.exercise25;

public class C extends B {
    @Override
    public void f() throws Ex3 {
        throw new Ex3();
    }

    public static void main(String[] args) throws Ex1 {
        C c = new C();
        A a = c;
        a.f();
    }
}
