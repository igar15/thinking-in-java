package ru.javaprojects.thinkinginjava.chapter15.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomList<T> {
    private List<T> storage = new ArrayList<>();
    private Random random = new Random();

    public void add(T element) {
        storage.add(element);
    }

    public T select() {
        int index = random.nextInt(storage.size());
        return storage.get(index);
    }
}
