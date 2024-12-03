package com.quest.Collections;

import java.util.ArrayList;

public class ReverseList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Original List");
        list.forEach(System.out::println);
        int size=list.size();
        for(int i=0;i<size/2;i++){
            int temp=list.get(i);
            list.set(i,list.get(size-i-1));
            list.set(size-i-1,temp);
        }
        System.out.println("Reversed List");
        list.forEach(System.out::println);
    }
}
