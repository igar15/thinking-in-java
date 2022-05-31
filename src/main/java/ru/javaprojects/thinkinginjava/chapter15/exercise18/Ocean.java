package ru.javaprojects.thinkinginjava.chapter15.exercise18;

import ru.javaprojects.thinkinginjava.chapter15.exercise13.Generator;

public class Ocean {

    public static void main(String[] args) {
        Generator<BigFish> bfgenerator = BigFish.generator();
        Generator<LittleFish> lfgenerator = LittleFish.generator();
        for (int i = 0; i < 5; i++) {
            System.out.println(bfgenerator.next() + " eats " + lfgenerator.next());
        }
    }

    static class BigFish {
        private static int counter = 1;
        private int id = counter++;

        private BigFish() {}

        public static Generator<BigFish> generator() {
            return BigFish::new;
        }

        @Override
        public String toString() {
            return "BigFish{" +
                    "id=" + id +
                    '}';
        }
    }

    static class LittleFish {
        private static int counter = 1;
        private int id = counter++;

        private LittleFish() {}

        public static Generator<LittleFish> generator() {
            return LittleFish::new;
        }

        @Override
        public String toString() {
            return "LittleFish{" +
                    "id=" + id +
                    '}';
        }
    }
}
