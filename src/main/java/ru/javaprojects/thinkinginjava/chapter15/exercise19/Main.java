package ru.javaprojects.thinkinginjava.chapter15.exercise19;

public class Main {
    public static void main(String[] args) {
        Ship ship = new Ship("Dark Star");
        Container container1 = new Container(10);
        Container container2 = new Container(20);
        container1.addCargo(new Cargo("Copper", 20000));
        container1.addCargo(new Cargo("Oil", 30000));
        container2.addCargo(new Cargo("Gold", 25000));
        ship.addContainer(container1);
        ship.addContainer(container2);
        System.out.println(ship);
    }
}
