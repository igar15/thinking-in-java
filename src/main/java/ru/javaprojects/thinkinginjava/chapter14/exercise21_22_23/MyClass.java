package ru.javaprojects.thinkinginjava.chapter14.exercise21_22_23;

public class MyClass implements MyInterface {
    @Override
    public void doSomething() {
        System.out.println("Start making real job");
        sleep(540);
        System.out.println("End making real job");
    }

    private void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
