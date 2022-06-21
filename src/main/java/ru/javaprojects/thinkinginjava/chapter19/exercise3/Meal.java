package ru.javaprojects.thinkinginjava.chapter19.exercise3;

public class Meal {
    public static void main(String[] args) {
        for (Course course : Course.values()) {
            System.out.println(course.randomSelection());
        }
    }
}
