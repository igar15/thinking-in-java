package ru.javaprojects.thinkinginjava.chapter16.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //    Peel<Banana>[] peels = new Peel<Banana>[3];
        List<Peel<Banana>> peels = new ArrayList<>();
        peels.add(new Peel<>(new Banana()));
    }
}
