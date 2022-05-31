package ru.javaprojects.thinkinginjava.chapter15.exercise19;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ship {
    private String name;
    private List<Container> containers;

    public Ship(String name) {
        this.name = name;
        containers = new ArrayList<>();
    }

    public void addContainer(Container container) {
        containers.add(container);
    }

    public void removeContainer(Container container) {
        containers.remove(container);
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", containers=" + containers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship ship = (Ship) o;
        return Objects.equals(name, ship.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
