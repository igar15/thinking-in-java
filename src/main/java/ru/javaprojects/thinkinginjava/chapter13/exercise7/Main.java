package ru.javaprojects.thinkinginjava.chapter13.exercise7;

public class Main {
    public static void main(String[] args) {
        String regex = "[A-Z](\\w|\\W)*\\.";
        String test1 = "A man with a dog.";
        String test2 = "A.";
        String test3 = "A man with a dog";
        String test4 = "man with a dog.";
        System.out.println(test1.matches(regex));
        System.out.println(test2.matches(regex));
        System.out.println(test3.matches(regex));
        System.out.println(test4.matches(regex));
    }
}
