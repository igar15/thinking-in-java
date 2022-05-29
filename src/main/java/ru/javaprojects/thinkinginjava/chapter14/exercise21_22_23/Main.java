package ru.javaprojects.thinkinginjava.chapter14.exercise21_22_23;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        MyInterface realObject = new MyClass();
        MyInterface dynamicProxy = (MyInterface) Proxy.newProxyInstance(Main.class.getClassLoader(), new Class[]{MyInterface.class}, new ProfilerProxy(realObject));
        dynamicProxy.doSomething();
    }
}
