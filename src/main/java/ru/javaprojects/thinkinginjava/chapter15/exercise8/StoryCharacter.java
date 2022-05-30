package ru.javaprojects.thinkinginjava.chapter15.exercise8;

public abstract class StoryCharacter {
    protected String name;

    public StoryCharacter(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " : " + name;
    }
}
