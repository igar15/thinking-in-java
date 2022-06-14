package ru.javaprojects.thinkinginjava.chapter17.exercise33;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FastTraversalLinkedList<E> {
    private List<E> linkedList = new LinkedList<>();
    private List<E> arrayList = new ArrayList<>();

    public void add(E element) {
        linkedList.add(element);
        arrayList.add(element);
    }

    public void remove(E element) {
        boolean remove = linkedList.remove(element);
        if (remove) {
            arrayList = new ArrayList<>(linkedList);
        }
    }

    public E get(int index) {
        return arrayList.get(index);
    }

    @Override
    public String toString() {
        return arrayList.toString();
    }
}
