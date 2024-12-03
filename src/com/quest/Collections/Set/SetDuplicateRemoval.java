package com.quest.Collections.Set;

import java.util.ArrayList;
import java.util.HashSet;

public class SetDuplicateRemoval {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("A");
        list.add("D");
        list.add("E");
        System.out.println(list);
        HashSet<String> set = new HashSet<>(list);
        System.out.println(set);
    }
}
