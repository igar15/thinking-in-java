package ru.javaprojects.thinkinginjava.chapter15.exercise11;

public class Main {
    public static void main(String[] args) {
        Holder<String> holder = New.holder();
        holder.setElement("123");
        System.out.println(holder.getElement());
    }
}
