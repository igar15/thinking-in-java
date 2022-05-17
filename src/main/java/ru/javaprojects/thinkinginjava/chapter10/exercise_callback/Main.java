package ru.javaprojects.thinkinginjava.chapter10.exercise_callback;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.doJob(new Worker());
        customer.presentJobResult();
    }
}
