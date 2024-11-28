package com.quest.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    public static void main(String[] args) {
        HashMap<Integer,String> h=new HashMap<>();
        h.put(1,"Banana");
        h.put(2,"Pineapple");
        h.put(3,"Apple");
        h.put(4,"Orange");
        h.put(5,"Mango");
        h.put(6,"Watermelon");
        for (String s:h.values()) {
            System.out.println(s);
        }
        for (Integer i:h.keySet()) {
            System.out.println(i);
        }
        System.out.println(h.put(5,"Grape"));
        for (Map.Entry<Integer,String> e:h.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        System.out.println(h.get(2));
        System.out.println(h.remove("Mango"));
        h.clear();
        System.out.println(h.isEmpty());
    }
}
