package ru.javaprojects.thinkinginjava.chapter19.exercise3;

import java.util.Random;

public enum Course {
    MAINCOURSE(Food.MainCourse.class), COFFEE(Food.Coffee.class);

    private Food[] values;

    private Course(Class<? extends Food> type) {
        values = type.getEnumConstants();
    }

    public Food randomSelection() {
        return values[new Random().nextInt(values.length)];
    }
}
