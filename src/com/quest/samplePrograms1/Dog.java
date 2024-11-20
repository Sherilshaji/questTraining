package com.quest.samplePrograms1;

public class Dog extends Animal implements Movable{
    private String color;
    public Dog(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
    public Dog() {
        super();
        this.color = "black";
    }
    public void updateAge(final int age) {
        System.out.println("Using final parameters "+age);

    }

    @Override
    void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public void move() {
        System.out.println("Dog moves");
    }

}
