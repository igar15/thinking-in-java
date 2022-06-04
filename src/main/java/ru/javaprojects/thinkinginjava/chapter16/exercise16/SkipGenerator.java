package ru.javaprojects.thinkinginjava.chapter16.exercise16;

import ru.javaprojects.thinkinginjava.chapter15.exercise13.Generator;

import java.util.Random;

public class SkipGenerator {
    public static class Double implements Generator<java.lang.Double> {
        private static double counter = 0;
        private double delta;

        public Double(double delta) {
            this.delta = delta;
        }

        @Override
        public java.lang.Double next() {
            counter = counter + delta;
            return counter;
        }
    }

    public static class Character implements Generator<java.lang.Character> {
        private static char counter = 0;
        private int delta;

        public Character(int delta) {
            this.delta = delta;
        }

        @Override
        public java.lang.Character next() {
            counter = (char) (counter + delta);
            return counter;
        }
    }
}
