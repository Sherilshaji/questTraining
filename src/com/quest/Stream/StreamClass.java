package com.quest.Stream;

import java.util.ArrayList;

public class StreamClass {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(16);
        System.out.println(list.stream().findFirst());
        System.out.println(list.stream().max(Integer::compareTo).get());
        System.out.println(list.stream().min(Integer::compareTo).get());
//        ArrayList<Integer> list1 = list.stream().findFirst();

    }
}
