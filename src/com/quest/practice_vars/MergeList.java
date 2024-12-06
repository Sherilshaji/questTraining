package com.quest.practice_vars;

import java.util.ArrayList;
import java.util.List;

public class MergeList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        List<String> list2=new ArrayList<>();
        list2.add("E");
        list2.add("F");
        list2.add("G");
        list2.add("H");
        List<String> list3=new ArrayList<>();
        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println(list3);
    }
}
