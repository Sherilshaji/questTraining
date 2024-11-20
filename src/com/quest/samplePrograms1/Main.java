package com.quest.samplePrograms1;

public class Main {
    public static void main(String[] args) {
        Dog dog=new Dog("Rio",6,"White");
        System.out.println(dog);
        dog.move();
        dog.sleep();
        Dog dog2=new Dog();
        System.out.println(dog2);
        dog2.move();
        dog2.sleep();

        dog.updateAge(7);
    }
}
