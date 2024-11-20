package com.quest.abstraction;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0]=new Dog("Cleo");
        animals[1]=new Cat("Kitty");

        for(Animal a:animals){
            a.eat();
            a.sleep();
        }
    }
}
