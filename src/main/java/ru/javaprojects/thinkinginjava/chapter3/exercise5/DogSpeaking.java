package ru.javaprojects.thinkinginjava.chapter3.exercise5;

public class DogSpeaking {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Spot", "I am Spot!");
        Dog dog2 = new Dog("Scruffy", "I am Scruffy!");
        System.out.printf("Dog %s says: \"%s\"\n", dog1.name, dog1.says);
        System.out.printf("Dog %s says: \"%s\"\n", dog2.name, dog2.says);
    }

    public static class Dog {
        private String name;
        private String says;

        public Dog(String name, String says) {
            this.name = name;
            this.says = says;
        }
    }
}
