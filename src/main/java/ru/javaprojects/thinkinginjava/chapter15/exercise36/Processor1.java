package ru.javaprojects.thinkinginjava.chapter15.exercise36;

import java.util.List;

public class Processor1 implements Processor<String, Failure1, Failure2> {
    private static int x = 5;

    @Override
    public void process(List<String> resultCollector) throws Failure1, Failure2 {
        resultCollector.add("OK");
        x--;
        if (x == 3) {
            throw new Failure1();
        }
        if (x == 2) {
            throw new Failure2();
        }
    }
}
