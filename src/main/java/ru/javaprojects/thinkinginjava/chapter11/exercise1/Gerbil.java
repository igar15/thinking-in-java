package ru.javaprojects.thinkinginjava.chapter11.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Gerbil {
    private int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public int hop() {
        System.out.println("Hop");
        return gerbilNumber;
    }

    public static void main(String[] args) {
        List<Gerbil> gerbils = new ArrayList<>();
        gerbils.add(new Gerbil(1));
        gerbils.add(new Gerbil(2));
        gerbils.add(new Gerbil(3));
        gerbils.add(new Gerbil(4));
        for (int i = 0; i < gerbils.size(); i++) {
            gerbils.get(i).hop();
        }
    }
}
