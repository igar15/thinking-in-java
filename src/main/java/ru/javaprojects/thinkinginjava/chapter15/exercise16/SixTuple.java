package ru.javaprojects.thinkinginjava.chapter15.exercise16;

public class SixTuple<A, B, C, D, E, F> {
    private A a;
    private B b;
    private C c;
    private D d;
    private E e;
    private F f;

    public SixTuple(A a, B b, C c, D d, E e, F f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    @Override
    public String toString() {
        return "SixTuple{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", e=" + e +
                ", f=" + f +
                '}';
    }
}
