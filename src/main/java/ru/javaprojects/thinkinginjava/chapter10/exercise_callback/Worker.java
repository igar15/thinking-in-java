package ru.javaprojects.thinkinginjava.chapter10.exercise_callback;

public class Worker {
    public void doWork(Callback callback) {
        System.out.println("Worker does some work");
        System.out.println("Worker did his job");
        System.out.println("Worker makes callback");
        callback.callback();
    }
}
