package ru.javaprojects.thinkinginjava.chapter14.exercise25;

import ru.javaprojects.thinkinginjava.chapter14.exercise25.inner.MyClass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        MyClass myClass = new MyClass();
        Class<? extends MyClass> clazz = myClass.getClass();
        Method methodA = clazz.getDeclaredMethod("a");
        Method methodB = clazz.getDeclaredMethod("b");
        Method methodC = clazz.getDeclaredMethod("c");
        methodA.setAccessible(true);
        methodB.setAccessible(true);
        methodC.setAccessible(true);
        methodA.invoke(myClass);
        methodB.invoke(myClass);
        methodC.invoke(myClass);
    }
}