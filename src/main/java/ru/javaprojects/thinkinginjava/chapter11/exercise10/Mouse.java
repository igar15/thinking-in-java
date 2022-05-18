package ru.javaprojects.thinkinginjava.chapter11.exercise10;

public class Mouse extends Rodent {
    private RodentTool rodentTool;

    public Mouse(RodentTool rodentTool) {
        System.out.println("Mouse cons");
        this.rodentTool = rodentTool;
        rodentTool.addRef();
    }

    @Override
    public void run() {
        System.out.println("Mouse runs");
    }

    @Override
    public void eat() {
        System.out.println("Mouse eats");
    }
}
