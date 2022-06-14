package ru.javaprojects.thinkinginjava.chapter17.exercise11;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Data> queue = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.offer(new Data());
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
