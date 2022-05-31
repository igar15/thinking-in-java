package ru.javaprojects.thinkinginjava.chapter15.exercise16;

public class Main {
    public static void main(String[] args) {
        SixTuple<String, Integer, String, Integer, String, Integer> sixTuple =
                sixTuple("", 1, "", 1, "", 1);
        System.out.println(sixTuple);

    }

    public static <A, B, C, D, E, F> SixTuple<A, B, C, D, E, F> sixTuple(A a, B b, C c, D d, E e, F f) {
        return new SixTuple<>(a, b, c, d, e, f);
    }
}
