package ru.javaprojects.thinkinginjava.chapter18.exercise11;

public class Event {
    private String name;
    private int time;

    public Event(String name, int time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
}
