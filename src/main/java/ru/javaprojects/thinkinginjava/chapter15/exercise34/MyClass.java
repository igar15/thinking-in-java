package ru.javaprojects.thinkinginjava.chapter15.exercise34;

public class MyClass extends A<MyClass> {

        @Override
    public MyClass work(MyClass myClass) {
        return myClass;
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.work(myClass);
    }
}
