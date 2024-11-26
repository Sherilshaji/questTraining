package com.quest.Collections;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<PersonLinkedList> list = new LinkedList<>();
        list.add(new PersonLinkedList("John",20));
        list.add(new PersonLinkedList("Jane",22));
        list.add(new PersonLinkedList("Jack",23));
        list.add(new PersonLinkedList("Mary",24));
        list.addFirst(new PersonLinkedList("Bob",25));
        list.addLast(new PersonLinkedList("Joe",26));

        for(PersonLinkedList s:list){
            System.out.println(s.getName());
        }
        System.out.println("-------");
        System.out.println("Get first--"+list.getFirst().getName());
        System.out.println("Get last--"+list.getLast().getName());
        System.out.println("Get(1)--"+list.get(1).getName());
        System.out.println("Size--"+list.size());
        System.out.println("Remove 4 th element--"+list.remove(3).getName());
        System.out.println("Remove first--"+list.removeFirst().getName());
        System.out.println("Remove last--"+list.removeLast().getName());
//        System.out.println("Contains Joe--"+list.contains(new PersonLinkedList("Joe",26)));
        System.out.println("Clearing data.");
        list.clear();
        System.out.println("Is empty--"+list.isEmpty());

    }
}
