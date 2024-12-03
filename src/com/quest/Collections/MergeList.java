package com.quest.Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class MergeList {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("E");
        list2.add("F");
        HashSet<String> set1 = new HashSet<>();
        set1.addAll(list1);
        set1.addAll(list2);
        set1.forEach(System.out::println);
    }
}
