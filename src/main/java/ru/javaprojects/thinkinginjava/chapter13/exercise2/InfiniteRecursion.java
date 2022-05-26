package ru.javaprojects.thinkinginjava.chapter13.exercise2;

public class InfiniteRecursion {
    @Override
    public String toString() {
       return ("Infinite recursion address:" + super.toString());
    }

    public static void main(String[] args) {
        System.out.println(new InfiniteRecursion());
    }
}
