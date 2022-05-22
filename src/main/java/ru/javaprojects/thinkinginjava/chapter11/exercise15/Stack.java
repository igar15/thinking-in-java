package ru.javaprojects.thinkinginjava.chapter11.exercise15;

import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void push(T element) {
        list.addFirst(element);
    }

    public T peek() {
        return list.peek();
    }

    public T pop() {
        return list.pop();
    }
}
