package ru.javaprojects.thinkinginjava.chapter19.exercise3;

public interface Food {
    enum MainCourse implements Food {
        LASAGNE, STEAK;
    }

    enum Coffee implements Food {
        BLACK, CAPUCINO;
    }
}
