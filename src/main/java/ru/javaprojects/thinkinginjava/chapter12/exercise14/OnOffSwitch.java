package ru.javaprojects.thinkinginjava.chapter12.exercise14;

public class OnOffSwitch {
    public static void main(String[] args) {
        try {
            doSm();
            throw new RuntimeException();
        } catch (OnOffEx1 ex1) {
            System.out.println(ex1);
        } catch (OnOffEx2 ex2) {
            System.out.println(ex2);
        }
    }

    public static void doSm() throws OnOffEx1, OnOffEx2 {
        System.out.println("do job");
    }
}
