package ru.javaprojects.thinkinginjava.chapter12.exercise15;

public class OnOffSwitch {
    public static void main(String[] args) {
        try {
            doSm();
            throw new RuntimeException();
        } catch (OnOffEx1 ex1) {
            System.out.println(ex1);
        } catch (OnOffEx2 ex2) {
            System.out.println(ex2);
        } finally {
            System.out.println("in finally fix problems");
        }
    }

    public static void doSm() throws OnOffEx1, OnOffEx2 {
        System.out.println("do job");
    }
}
