package ru.javaprojects.thinkinginjava.chapter7.exercise14;

public class Car {
    public Engine engine;

    public Car() {
        engine = new Engine();
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.engine.service();
    }
}

class Engine {
    public void start() {}

    public void stop() {}

    public void service() {}
}
