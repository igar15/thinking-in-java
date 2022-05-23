package ru.javaprojects.thinkinginjava.chapter11.exercise27;

import java.util.Queue;

public class QueueIterator {
    public static void iterate(Queue<Command> queue) {
        while (!queue.isEmpty()) {
            System.out.println(queue.remove().operation());
        }
    }
}
