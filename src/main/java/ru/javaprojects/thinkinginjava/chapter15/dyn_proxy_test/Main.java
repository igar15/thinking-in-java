package ru.javaprojects.thinkinginjava.chapter15.dyn_proxy_test;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Workable workable = () -> System.out.println("Do real work");
        Workable proxy = (Workable) Proxy.newProxyInstance(Main.class.getClassLoader(), new Class<?>[]{Workable.class}, new MyProxy(workable));
        proxy.doWork();
    }
}
