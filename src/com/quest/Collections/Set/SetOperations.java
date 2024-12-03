package com.quest.Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        HashSet<Integer> set3 = new HashSet<>();
        set3.addAll(set);
        set3.addAll(set2);
        System.out.println("Union: "+set3);
        HashSet<Integer> set4 = new HashSet<>();
        set4.addAll(set);
        set4.retainAll(set2);
        System.out.println("Intersection: "+set4);
        HashSet<Integer> set5 = new HashSet<>();
        set5.addAll(set);
        set5.removeAll(set2);
        System.out.println("Difference (set1-set2): "+set5);
    }
}
