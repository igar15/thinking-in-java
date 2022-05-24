package ru.javaprojects.thinkinginjava.chapter12.exercise5;

public class Main {
    private static int counter = 0;

    public static void main(String[] args) {
        doWork();
    }

    public static void doWork() {
        boolean workIsDone = false;
        while (!workIsDone) {
            try {
                load();
                System.out.println("Loading is success!");
                workIsDone = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void load() throws Exception {
        if (counter < 5) {
            counter++;
            throw new Exception("Can not load");
        }
    }
}
