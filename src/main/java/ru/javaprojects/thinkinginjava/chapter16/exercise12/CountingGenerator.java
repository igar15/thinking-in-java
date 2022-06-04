package ru.javaprojects.thinkinginjava.chapter16.exercise12;

import ru.javaprojects.thinkinginjava.chapter15.exercise13.Generator;

import java.util.Random;

public class CountingGenerator {
    public static class Double implements Generator<java.lang.Double> {
        private double counter = 0;

        @Override
        public java.lang.Double next() {
            counter = counter + 1.0;
            return counter;
        }
    }

    public static class Character implements Generator<java.lang.Character> {
        private static char[] chars = {'a', 'b', 'c', 'd', 'e'};
        private static Random random = new Random();

        @Override
        public java.lang.Character next() {
            return chars[random.nextInt(chars.length)];
        }
    }

    public static class Boolean implements Generator<java.lang.Boolean> {
        private boolean flag = false;

        @Override
        public java.lang.Boolean next() {
            flag = !flag;
            return flag;
        }
    }

    public static class Integer implements Generator<java.lang.Integer> {
        private Random random = new Random();

        @Override
        public java.lang.Integer next() {
            return random.nextInt(10000);
        }
    }

    public static class Byte implements Generator<java.lang.Byte> {
        private Random random = new Random();

        @Override
        public java.lang.Byte next() {
            return (byte) random.nextInt(127);
        }
    }
}
