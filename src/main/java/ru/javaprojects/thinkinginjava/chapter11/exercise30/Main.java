package ru.javaprojects.thinkinginjava.chapter11.exercise30;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        CollectionSequence sequence = new CollectionSequence();
        Pet pet1 = new Pet("Dog");
        Pet pet2 = new Pet("Cat");
        Pet pet3= new Pet("Fish");
        Pet pet4 = new Pet("Bird");
        sequence.add(pet1);
        sequence.add(pet2);
        sequence.add(pet3);
        sequence.add(pet4);
        showElements(sequence.iterator());
        sequence.remove(pet2);
        showElements(sequence.iterator());
        sequence.add(pet2);
        showElements(sequence.iterator());
        sequence.retainAll(Arrays.asList(pet1, pet2));
        showElements(sequence.iterator());
    }

    private static <T> void showElements(Iterator<T> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }
}
