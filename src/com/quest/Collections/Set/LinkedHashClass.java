package com.quest.Collections.Set;

import java.util.LinkedHashSet;

public class LinkedHashClass {
    public static void main(String[] args) {
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("A");
        a.add("B");
        a.add("C");
        a.add("D");
        a.add("E");
        a.add(null);
        a.add(null);
        for(String s:a){
            System.out.println(s);
        }
        System.out.println(a.contains("A"));
        System.out.println(a.size());
        System.out.println(a.isEmpty());
        System.out.println(a.remove("B"));
        a.clear();
        System.out.println(a.isEmpty());
    }
}
