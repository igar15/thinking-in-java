package ru.javaprojects.thinkinginjava.chapter15.exercise7;

import java.util.Iterator;

public class FibonacciIterableAdapter implements Iterable<Integer> {
    private Fibonacci fibonacci = new Fibonacci();
    private int amount;

    public FibonacciIterableAdapter(int amount) {
        this.amount = amount;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return amount > 0;
            }

            @Override
            public Integer next() {
                amount--;
                return fibonacci.next();
            }
        };
    }
}
