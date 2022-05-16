package ru.javaprojects.thinkinginjava.chapter10.exercise12;

public class Main {
    public static void main(String[] args) {
        DangerousMonster monster = new DangerousMonster() {
            @Override
            public void bite() {
                System.out.println("BITEEEE!!!");
            }
        };
        monster.bite();
        Vampire vampire = new Vampire() {
            @Override
            public void drinkBlood() {
                System.out.println("I will drink your blood!!!!");
            }

            @Override
            public void bite() {
                System.out.println("Vampire bite!!!");
            }
        };
        vampire.bite();
        vampire.drinkBlood();
    }
}
