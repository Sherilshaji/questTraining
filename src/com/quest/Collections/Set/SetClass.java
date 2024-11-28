package com.quest.Collections.Set;

import com.quest.interfaces.InterfaceB;

import java.util.HashSet;

public class SetClass {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(5);
        set.add(4);
        set.add(null);
        for (Integer i : set) {
            System.out.println(i);
        }
        System.out.println(set.size());
        System.out.println(set.contains(null));
        System.out.println(set.remove(1));
        System.out.println(set.isEmpty());
    }
}
