package com.quest.Collections.Set;

import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(5);
        treeSet.add(null);
        for (Integer integer : treeSet) {
            System.out.println(integer);
        }
        System.out.println("-----");
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.descendingSet());
        System.out.println(treeSet.floor(10));
        System.out.println(treeSet.headSet(treeSet.size(), true));
//        System.out.println(treeSet.size());
        System.out.println(treeSet.tailSet(treeSet.size(), true));
        System.out.println(treeSet.floor((int) 5.6));
        System.out.println();
    }
}
