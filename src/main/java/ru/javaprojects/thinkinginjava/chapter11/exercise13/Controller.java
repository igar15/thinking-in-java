package ru.javaprojects.thinkinginjava.chapter11.exercise13;

import java.util.*;

public class Controller {
    private List<Event> eventList = new LinkedList<>();

    public void addEvent(Event c) {
        eventList.add(c);
    }

    public void run() {
        Iterator<Event> iterator = new LinkedList<>(eventList).iterator();
        while (iterator.hasNext()) {
            Event event = iterator.next();
            if (event.ready()) {
                System.out.println(event);
                event.action();
                eventList.remove(event);
            }
        }
    }
}
