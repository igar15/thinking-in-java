package ru.javaprojects.thinkinginjava.chapter11.exercise10;

public class RodentTool {
    private int refCounter = 0;

    public RodentTool(String s) {
        System.out.println("Rodent Tool " + s);
    }

    public void addRef() {
        refCounter++;
    }

    public int getRefCounter() {
        return refCounter;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize, ref counter = " + refCounter);
    }
}
