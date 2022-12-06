package com.github.carloscontrerasruiz;

public class Dog {
    private int age;
    private String name;
    private String race;

    public Dog() {
    }

    public Dog(int age, String name, String race) {
        this.age = age;
        this.name = name;
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", race='" + race + '\'' +
                '}';
    }
}
