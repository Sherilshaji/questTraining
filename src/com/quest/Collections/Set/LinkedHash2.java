package com.quest.Collections.Set;

import java.util.LinkedHashSet;

public class LinkedHash2 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 20; i <= 100; i++) {
            set.add(i);
        }
        set.add(15);
        set.add(2);
        set.add(13);
        set.add(4);
        set.add(17);
        set.add(9);
        set.add(1);
        set.add(null);
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
