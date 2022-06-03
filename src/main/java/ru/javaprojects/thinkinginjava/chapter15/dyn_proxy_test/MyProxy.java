package ru.javaprojects.thinkinginjava.chapter15.dyn_proxy_test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyProxy implements InvocationHandler {
    private Workable workable;

    public MyProxy(Workable workable) {
        this.workable = workable;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Do proxy work start");
        method.invoke(workable, args);
        System.out.println("Do proxy work end");
        return null;
    }
}
