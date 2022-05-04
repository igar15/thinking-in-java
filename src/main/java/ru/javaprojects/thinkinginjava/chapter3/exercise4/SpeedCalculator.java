package ru.javaprojects.thinkinginjava.chapter3.exercise4;

public class SpeedCalculator {
    public static double calculateSpeed(double distance, int time) {
        return distance / time;
    }

    public static void main(String[] args) {
        double distance = 100.5;
        int time = 10;
        System.out.printf("Speed for distance %.2f meters and time %d seconds is %.2f m/s", distance, time, calculateSpeed(distance, time));
    }
}