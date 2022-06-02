package ru.javaprojects.thinkinginjava.chapter15.exercise36;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ProcessorList<String, Failure1, Failure2> processorList = new ProcessorList<>();
        processorList.addProcessor(new Processor1());
        processorList.addProcessor(new Processor1());
        processorList.addProcessor(new Processor1());
        processorList.doProcessing(new ArrayList<>());
    }
}
