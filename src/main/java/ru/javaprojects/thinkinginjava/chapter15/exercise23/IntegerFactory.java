package ru.javaprojects.thinkinginjava.chapter15.exercise23;

public class IntegerFactory implements FactoryI<Integer> {
    @Override
    public Integer create(String s) {
        return 100;
    }
}
