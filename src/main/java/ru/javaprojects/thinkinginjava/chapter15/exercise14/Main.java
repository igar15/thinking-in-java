package ru.javaprojects.thinkinginjava.chapter15.exercise14;

public class Main {
    public static void main(String[] args) {
        BasicGenerator<Data> integerBasicGenerator = BasicGenerator.create(Data.class);
        System.out.println(integerBasicGenerator.next());

        integerBasicGenerator = new BasicGenerator<>(Data.class);
        System.out.println(integerBasicGenerator.next());
    }
}
