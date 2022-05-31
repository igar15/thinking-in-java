package ru.javaprojects.thinkinginjava.chapter15.exercise19;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Container {
    private int id;
    private List<Cargo> cargos;

    public Container(int id) {
        this.id = id;
        cargos = new ArrayList<>();
    }

    public void addCargo(Cargo cargo) {
        cargos.add(cargo);
    }

    public void removeCargo(Cargo cargo) {
        cargos.remove(cargo);
    }

    @Override
    public String toString() {
        return "Container{" +
                "id=" + id +
                ", cargos=" + cargos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Container container = (Container) o;
        return id == container.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
