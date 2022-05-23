package ru.javaprojects.thinkinginjava.chapter11.exercise27;

public class Command {
    private String name;

    public Command(String name) {
        this.name = name;
    }

    public String operation() {
        return name;
    }
}
