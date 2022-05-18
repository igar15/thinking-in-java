package ru.javaprojects.thinkinginjava.chapter11.exercise7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyClass {
    private String name;

    public MyClass(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        MyClass[] myClasses = {new MyClass("1"), new MyClass("2"), new MyClass("3"), new MyClass("4")};
        List<MyClass> myClassList = new ArrayList<>();
        Collections.addAll(myClassList, myClasses);
        List<MyClass> subList = myClassList.subList(1, 3);
        myClassList.removeAll(subList);
        System.out.println(myClassList);
    }
}
