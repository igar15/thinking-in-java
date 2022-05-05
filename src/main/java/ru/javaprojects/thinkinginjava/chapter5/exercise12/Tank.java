package ru.javaprojects.thinkinginjava.chapter5.exercise12;

public class Tank {
    private int capacity;

    public Tank(int capacity) {
        this.capacity = capacity;
    }

    public void makeEmpty() {
        capacity = 0;
    }

    @Override
    protected void finalize() throws Throwable {
        if (capacity != 0) {
            System.out.println("Error! Tank must be empty before finalize");
        } else {
            System.out.println("It's OK! Tank is empty");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            new Tank(10);
            Tank tank = new Tank(5);
            tank.makeEmpty();
        }
    }
}
