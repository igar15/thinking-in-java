package ru.javaprojects.thinkinginjava.chapter14.exercise1_2_19;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflMain {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<Toy> constructor = Toy.class.getConstructor(int.class);
        Toy toy = constructor.newInstance(20);
        System.out.println(toy);
    }
}
