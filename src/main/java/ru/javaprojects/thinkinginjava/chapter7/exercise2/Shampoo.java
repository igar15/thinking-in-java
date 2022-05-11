package ru.javaprojects.thinkinginjava.chapter7.exercise2;

public class Shampoo extends Detergent{
    @Override
    public void scrub() {
        append("shampoo scrub");
        super.scrub();
    }

    public void sterilize() {
        append("sterilize");
    }
}
