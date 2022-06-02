package ru.javaprojects.thinkinginjava.chapter15.exercise29;

import ru.javaprojects.thinkinginjava.chapter15.exercise11.Holder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public static void work(Holder<List<?>> holder) {
        List<?> element = holder.getElement();
        holder.setElement(new ArrayList<Integer>());
//        element.add("123");
        Object o = element.get(0);
    }

    public static void work2(List<Holder<?>> list) {
        Holder<?> holder = list.get(0);
        list.add(new Holder<String>());
        Object element = holder.getElement();
//        holder.setElement(new Object());
    }
}
