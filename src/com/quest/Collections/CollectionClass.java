package com.quest.Collections;

import java.util.*;

public class CollectionClass {
    public static void main(String[] args) {

//        System.out.println("-------");
//        System.out.println("ArrayList: ");
//        Comparator<Person> test1=Comparator.comparing(Person::getName);
//        ArrayList<Person> list = new ArrayList<>(test1);
//        list.add(new Person("John",21));
//        list.add(new Person("Jane",22));
//        list.add(new Person("Jack",23));
//        list.add(new Person("Mary",19));
//        list.add(new Person("Bob",18));
//        for (Person person : list) {
//                System.out.println(person.getName()+" "+person.getAge());
//        }
        System.out.println("-------");

        System.out.println("PriorityQueue: ");
        Comparator<Person> test=Comparator.comparing(Person::getName);
        PriorityQueue<Person> pq = new PriorityQueue<>(test);
        pq.add(new Person("John",20));
        pq.add(new Person("Jane",22));
        pq.add(new Person("Jack",23));
        pq.add(new Person("Bob",24));
        for (Person person : pq) {
            System.out.println(person.getName()+" "+person.getAge());
        }


















































//        System.out.println("-------");
//        System.out.println("HashSet: ");
//        HashSet<Person> set = new HashSet<>();
//        set.add(new Person("John",20));
//        set.add(new Person("Jane",22));
//        set.add(new Person("Jack",23));
//        set.add(new Person("Bob",24));
//        for (Person person : set) {
//            System.out.println(person.getName()+" "+person.getAge());
//        }
//        System.out.println("-------");
//        LinkedHashMap<Integer, Person> map = new LinkedHashMap<>();
//        map.put(1,new Person("John",20));
//        map.put(2,new Person("Jane",22));
//        map.put(3,new Person("Jack",23));
//        map.put(4,new Person("Bob",24));
//        map.put(5,new Person("David",25));
//        System.out.println("LinkedHashMap: ");
//        for (Map.Entry<Integer,Person> e:map.entrySet()){
//            System.out.println(e.getKey()+" "+e.getValue().getName());
//        }
    }
}
