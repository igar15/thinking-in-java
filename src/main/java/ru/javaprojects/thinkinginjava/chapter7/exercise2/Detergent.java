package ru.javaprojects.thinkinginjava.chapter7.exercise2;

public class Detergent extends Cleanser {
    @Override
    public void scrub() {
        append("detergent scrub");
        super.scrub();
    }
}
