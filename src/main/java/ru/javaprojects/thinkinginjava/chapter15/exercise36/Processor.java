package ru.javaprojects.thinkinginjava.chapter15.exercise36;

import java.util.List;

public interface Processor<T, E extends Exception, R extends Exception> {
    void process(List<T> resultCollector) throws E, R;
}
