package ru.javaprojects.thinkinginjava.chapter8.exercise9_12_14_15;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        while (true) {
            RodentTool rodentTool = new RodentTool("shared rodent tool");
            Rodent[] rodents = new Rodent[] {new Mouse(rodentTool), new Hamster(rodentTool), new Mouse(rodentTool)};
            Arrays.stream(rodents)
                    .forEach(rodent -> {
                        rodent.run();
                        rodent.eat();
                    });
            System.out.println(rodentTool.getRefCounter() == 3);
        }
    }
}
