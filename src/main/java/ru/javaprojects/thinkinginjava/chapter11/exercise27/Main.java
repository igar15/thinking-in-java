package ru.javaprojects.thinkinginjava.chapter11.exercise27;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Command> queue = new LinkedList<>();
        queue.offer(new Command("print"));
        queue.offer(new Command("write"));
        queue.offer(new Command("read"));
        System.out.println(queue);
        QueueIterator.iterate(queue);
    }
}
