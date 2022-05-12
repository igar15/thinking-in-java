package ru.javaprojects.thinkinginjava.chapter8.exercise9_12_14;

public class Hamster extends Rodent {
    private RodentTool rodentTool;

    public Hamster(RodentTool rodentTool) {
        System.out.println("Hamster cons");
        this.rodentTool = rodentTool;
        rodentTool.addRef();
    }

    @Override
    public void run() {
        System.out.println("Hamster runs");
    }

    @Override
    public void eat() {
        System.out.println("Hamster eats");
    }
}
