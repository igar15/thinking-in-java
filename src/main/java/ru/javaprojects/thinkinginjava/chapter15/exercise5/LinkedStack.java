package ru.javaprojects.thinkinginjava.chapter15.exercise5;

public class LinkedStack<T> {
    private Node<T> top = new Node<>();

    private static class Node<T> {
        private T value;
        private Node<T> next;

        public Node() {
        }

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }

    public void push(T element) {
        top = new Node<>(element, top);
    }

    public T pop() {
        if (top.value == null) {
            return null;
        } else {
            T topElement = top.value;
            top = top.next;
            return topElement;
        }
    }
}
