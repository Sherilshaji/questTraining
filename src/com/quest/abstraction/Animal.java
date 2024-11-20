package com.quest.abstraction;

public abstract class Animal {
    private String name;

    public abstract void eat();
    public abstract void sleep();

    public Animal(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
