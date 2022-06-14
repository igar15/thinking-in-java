package ru.javaprojects.thinkinginjava.chapter17.exercise8;

public class Main {
    public static void main(String[] args) {
        SList<String> sList = new SList<>();
        SList<String>.SListIterator<String> iterator = sList.iterator();
        iterator.add("1");
        iterator.add("2");
        iterator.add("3");
        System.out.println(sList);
        iterator = sList.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.equals("1")) {
                iterator.remove();
            }
        }
        System.out.println(sList);
    }
}
