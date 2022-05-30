package ru.javaprojects.thinkinginjava.chapter15.exercise8;

public class Main {
    public static void main(String[] args) {
        BadGuyGenerator badGuyGenerator = new BadGuyGenerator();
        GoodGuyGenerator goodGuyGenerator = new GoodGuyGenerator();
        System.out.println(badGuyGenerator.next());
        System.out.println(badGuyGenerator.next());
        System.out.println(badGuyGenerator.next());
        System.out.println(goodGuyGenerator.next());
        System.out.println(goodGuyGenerator.next());
    }
}
