package ru.javaprojects.thinkinginjava.chapter15.exercise36;

import java.util.ArrayList;
import java.util.List;

public class ProcessorList<T, E extends Exception, R extends Exception> {
    private List<Processor<T, E, R>> processors = new ArrayList<>();

    public void addProcessor(Processor<T, E, R> processor) {
        processors.add(processor);
    }

    public void doProcessing(List<T> list) throws Exception {
        for (Processor<T, E, R> processor : processors) {
            processor.process(list);
        }
    }
}
