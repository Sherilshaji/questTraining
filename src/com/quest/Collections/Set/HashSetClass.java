package com.quest.Collections.Set;

import java.util.HashSet;

public class HashSetClass {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 20; i <= 100; i++) {
            hs.add(i);
        }
        hs.add(15);
        hs.add(2);
        hs.add(13);
        hs.add(4);
        hs.add(17);
        hs.add(9);
        hs.add(1);
        hs.add(null);
        for (Integer i : hs) {
            System.out.println(i);
        }
    }
}
