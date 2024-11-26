package com.quest.Collections;

import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("Z");
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add(4,"E");
        list.addLast("X");
//        System.out.println(list.get(1));
//        System.out.println(list.remove());
        System.out.println(list.size());
        System.out.println("-------");
//        list.clear();
        for (String s : list) {
            System.out.println(s);
        }
        LinkedList<String> list1=new LinkedList<>();
//        System.out.println(list.isEmpty());
        System.out.println(list.contains("Y"));
    }
}
