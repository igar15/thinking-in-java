package ru.javaprojects.thinkinginjava.chapter18.exercise27;

import java.io.Serializable;

public class Data implements Serializable {
    private String description;

    public Data(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Data{" +
                "description='" + description + '\'' +
                '}';
    }
}
