package ru.javaprojects.thinkinginjava.chapter11.exercise10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        while (true) {
            RodentTool rodentTool = new RodentTool("shared rodent tool");
            List<Rodent> rodents = new ArrayList<>();
            rodents.add(new Mouse(rodentTool));
            rodents.add(new Hamster(rodentTool));
            rodents.add(new Mouse(rodentTool));
            Iterator<Rodent> iterator = rodents.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
            System.out.println(rodentTool.getRefCounter() == 3);
        }
    }
}
