package ru.javaprojects.thinkinginjava.chapter17.exercise7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("1", "2"));
        List<String> list2 = new LinkedList<>(Arrays.asList("3", "4"));
        Iterator<String> iterator1 = list1.iterator();
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next());
        }
        System.out.println();
        Iterator<String> iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next());
        }
        System.out.println();

        ListIterator<String> listIterator = list1.listIterator();
        while (listIterator.hasNext()) {
            listIterator.next();
            for (String s : list2) {
                listIterator.add(s);
            }
        }
        System.out.println(list1);
        listIterator = list2.listIterator(list2.size());
        list1 = new ArrayList<>(Arrays.asList("1", "2"));
        while (listIterator.hasPrevious()) {
            listIterator.previous();
            for (String s : list1) {
                listIterator.add(s);
            }
            for (int i = 0; i < list1.size(); i++) {
                listIterator.previous();
            }
        }
        System.out.println(list2);
    }
}
