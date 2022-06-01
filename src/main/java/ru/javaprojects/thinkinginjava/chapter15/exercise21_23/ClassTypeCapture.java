package ru.javaprojects.thinkinginjava.chapter15.exercise21_23;

import java.util.HashMap;
import java.util.Map;

public class ClassTypeCapture {
    Map<String, Factory<?>> factories = new HashMap<>();

    public void addType(String typeName, Factory<?> factory) {
        factories.put(typeName, factory);
    }

    public Object createNew(String typeName) {
        Factory<?> factory = factories.get(typeName);
        if (factory != null) {
            return factory.create();
        } else {
            throw new RuntimeException("Factory not found " + typeName);
        }
    }

    public static void main(String[] args) {
        ClassTypeCapture classTypeCapture = new ClassTypeCapture();
        classTypeCapture.addType("String", new StringFactory());
        String string = (String) classTypeCapture.createNew("String");
        System.out.println(string);
    }

    static class StringFactory implements Factory<String> {
        @Override
        public String create() {
            return "123456";
        }
    }

}
