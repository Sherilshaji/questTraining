package com.quest.Collections.Set;

import java.util.TreeSet;

public class TreeSet2 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 20; i <= 100; i++) {
            treeSet.add(i);
        }
        treeSet.add(15);
        treeSet.add(2);
        treeSet.add(13);
        treeSet.add(4);
        treeSet.add(17);
        treeSet.add(9);
        treeSet.add(1);
//        treeSet.add(null);
        for (Integer i : treeSet) {
            System.out.println(i);
        }
    }
}
