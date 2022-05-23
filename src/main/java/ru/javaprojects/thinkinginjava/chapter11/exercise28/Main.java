package ru.javaprojects.thinkinginjava.chapter11.exercise28;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Queue<Double> queue = new PriorityQueue<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            queue.offer(random.nextDouble());
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
