package ru.javaprojects.thinkinginjava.chapter15.exercise13;

import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Generators {

    public static  <T> List<T> fill(List<T> list, Generator<T> generator, int n) {
        for (int i = 0; i < n; i++) {
            list.add(generator.next());
        }
        return list;
    }

    public static <T> Queue<T> fill(Queue<T> queue, Generator<T> generator, int n) {
        for (int i = 0; i < n; i++) {
            queue.add(generator.next());
        }
        return queue;
    }

    public static <T> Set<T> fill(Set<T> set, Generator<T> generator, int n) {
        for (int i = 0; i < n; i++) {
            set.add(generator.next());
        }
        return set;
    }
}
