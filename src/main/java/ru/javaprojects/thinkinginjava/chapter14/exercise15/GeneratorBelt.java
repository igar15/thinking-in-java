package ru.javaprojects.thinkinginjava.chapter14.exercise15;

public class GeneratorBelt extends Belt {
    public static class GeneratorBeltFactory implements Factory<GeneratorBelt> {
        @Override
        public GeneratorBelt createInstance() {
            return new GeneratorBelt();
        }
    }
}
