package ru.javaprojects.thinkinginjava.chapter11.exercise29;

import java.util.PriorityQueue;
import java.util.Queue;

public class Data {

    public static void main(String[] args) {
        Queue<Data> queue = new PriorityQueue<>();
        queue.offer(new Data());
        queue.offer(new Data());
        queue.offer(new Data());
    }
}
