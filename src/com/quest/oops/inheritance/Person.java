package com.quest.oops.inheritance;

public class Person {
    public String name;
    public int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void nameDisplay(){
        String msg=String.format("%s is %d years old", name, age);
        System.out.println(this.name);
        System.out.println(msg);
    }
}
