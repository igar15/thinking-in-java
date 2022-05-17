package ru.javaprojects.thinkinginjava.chapter10.exercise_callback;

public class Customer {
    private String jobResult = "Not ready";

    public void doJob(Worker worker) {
        worker.doWork(new CustomerCallback());
    }

    public void presentJobResult() {
        System.out.println("Job result is " + jobResult);
    }

    private class CustomerCallback implements Callback {
        @Override
        public void callback() {
            jobResult = "Ready";
        }
    }

}
