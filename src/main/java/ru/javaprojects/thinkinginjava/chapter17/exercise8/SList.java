package ru.javaprojects.thinkinginjava.chapter17.exercise8;

public class SList<T> {
    private Node<T> first;

    private static class Node<T> {
        private T element;
        private Node<T> next;

        public Node(T element) {
            this.element = element;
        }
    }

    public SListIterator<T> iterator() {
        return new SListIterator<>();
    }

    public class SListIterator<K> {
        private Node cursor = first;
        private Node prePrevious;
        private Node previous;

        public boolean hasNext() {
            return cursor != null;
        }

        public K next() {
            Node current = cursor;
            prePrevious = previous;
            previous = current;
            cursor = current.next;
            return (K) current.element;
        }

        public void add(K element) {
            Node newNode = new Node(element);
            if (first == null) {
                first = newNode;
            } else {
                cursor.next = newNode;
            }
            cursor = newNode;
        }

        public void remove() {
            if (prePrevious == null) {
                first = cursor;
            } else {
                prePrevious.next = cursor;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        SListIterator<T> iterator = iterator();
        while (iterator.hasNext()) {
            stringBuilder.append(iterator.next());
            stringBuilder.append(", ");
        }
        return stringBuilder.substring(0, stringBuilder.length() - 2);
    }
}
