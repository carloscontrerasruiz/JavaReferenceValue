package com.github.carloscontrerasruiz;

public class MainClass {

    public static void main(String[] args) {
        int number = 1;
        String name = "Carlos";
        Dog dog = new Dog(1, "Appa", "PUG");

        changeNumber(number);
        System.out.println("GLOBAL: " + number);

        changeName(name);
        System.out.println("GLOBAL: " + name);


        changeObject(dog);
        System.out.println("GLOBAL: " + dog);
        changeObjectNewObject(dog);
        System.out.println("GLOBAL2: " + dog);
    }

    private static void changeObject(Dog dog) {
        dog.setName("Momo");
        dog.setRace("LABRADOR");
        System.out.println("LOCAL: " + dog);
    }

    private static void changeObjectNewObject(Dog dog) {
        dog = new Dog();
        dog.setName("Lassie");
        dog.setRace("COLLIE");
        System.out.println("LOCAL2: " + dog);
    }

    private static void changeName(String name) {
        name = "Alfredo";
        System.out.println("LOCAL: " + name);
    }

    private static void changeNumber(int number) {
        number = 100;
        System.out.println("LOCAL: " + number);
    }
}
