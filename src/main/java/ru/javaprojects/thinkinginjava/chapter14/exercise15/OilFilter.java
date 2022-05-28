package ru.javaprojects.thinkinginjava.chapter14.exercise15;

public class OilFilter extends Filter {
    public static class OilFilterFactory implements Factory<OilFilter> {
        @Override
        public OilFilter createInstance() {
            return new OilFilter();
        }
    }
}
