package ru.javaprojects.thinkinginjava.chapter14.exercise21_22_23;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProfilerProxy implements InvocationHandler {
    private Object proxied;

    public ProfilerProxy(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        System.out.println(proxy);
        long startTime = System.currentTimeMillis();
        Object result = method.invoke(proxied, args);
        long endTime = System.currentTimeMillis();
        System.out.printf("Method \"%s\" working time is %d milliseconds\n", method.getName(), endTime - startTime);
        return result;
    }
}
