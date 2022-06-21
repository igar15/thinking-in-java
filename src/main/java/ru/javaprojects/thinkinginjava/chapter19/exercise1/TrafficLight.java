package ru.javaprojects.thinkinginjava.chapter19.exercise1;

import static ru.javaprojects.thinkinginjava.chapter19.exercise1.TrafficLight.Color.*;

public class TrafficLight {
    private Color state = RED;

    enum Color {
        RED, YELLOW, GREEN;
    }

    public void changeColor() {
        switch (state) {
            case RED:
                state = GREEN;
                break;
            case GREEN:
                state = YELLOW;
                break;
            case YELLOW:
                state = RED;
                break;
        }
    }

    @Override
    public String toString() {
        return "TrafficLight{" +
                "state=" + state +
                '}';
    }
}
