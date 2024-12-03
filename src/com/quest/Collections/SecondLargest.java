package com.quest.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class SecondLargest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(3);
        list.add(24);
        list.add(8);
        list.add(15);
        System.out.println("Original list: "+list);
        Collections.sort(list);
        System.out.println("Removed second largest element: "+list.remove(list.size()-2));
        System.out.println("New list: "+list);
    }
}
