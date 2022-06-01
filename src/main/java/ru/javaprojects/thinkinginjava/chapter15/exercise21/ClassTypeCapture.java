package ru.javaprojects.thinkinginjava.chapter15.exercise21;

import java.util.HashMap;
import java.util.Map;

public class ClassTypeCapture {
    Map<String, Class<?>> types = new HashMap<>();

    public void addType(String typeName, Class<?> kind) {
        types.put(typeName, kind);
    }

    public Object createNew(String typeName) {
        Class<?> clazz = types.get(typeName);
        if (clazz != null) {
            return create(clazz);
        } else {
            throw new RuntimeException("Type nit found " + typeName);
        }
    }

    private Object create(Class<?> clazz) {
        try {
            return clazz.newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        ClassTypeCapture classTypeCapture = new ClassTypeCapture();
        classTypeCapture.addType("String", String.class);
        String string = (String) classTypeCapture.createNew("String");
        System.out.println(string);
    }
}
