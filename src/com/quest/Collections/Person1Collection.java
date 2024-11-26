package com.quest.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Person1Collection {
    public static void main(String[] args) {
        ArrayList<Person1> list = new ArrayList<>();
        list.add(new Person1("John",21,"male"));
        list.add(new Person1("Jane",22,"female"));
        list.add(new Person1("Jack",23,"male"));
        list.add(new Person1("Mary",19,"female"));
        list.add(new Person1("Bob",18,"male"));
        System.out.println("Person with age greater than 20");
        for (Person1 person : list) {
            if(person.getAge()>20){
                System.out.println(person.getName()+" "+person.getAge()+" "+person.getGender());
            }
        }
        System.out.println("Person with age less than 20");
        Iterator<Person1> iterator = list.iterator();
        while(iterator.hasNext()){
            Person1 person = iterator.next();
            if(person.getAge()<20){
                System.out.println(person.getName()+" "+person.getAge()+" "+person.getGender());
            }
        }
    }
}
