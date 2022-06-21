package ru.javaprojects.thinkinginjava.chapter19.exercise1;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        for (int i = 0; i < 15; i++) {
            System.out.println(trafficLight);
            trafficLight.changeColor();
        }
    }
}
