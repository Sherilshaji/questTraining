package com.quest.samplePrograms1;

public abstract class Animal{
    private String animalName;
    private int age;
    public Animal(String animalName, int age) {
        this.animalName = animalName;
        this.age = age;
    }
    abstract void eat();
    public Animal() {
        this.animalName = "Animal";
        this.age = 0;
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
    public void updateAge(final int age) {
        System.out.println("Using final parameters "+age);
    }
    public String toString(){
        return "Animal Name: " + animalName + ", Age: " + age;
    }

}
