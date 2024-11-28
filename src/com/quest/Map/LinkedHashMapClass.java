package com.quest.Map;

import java.util.LinkedHashMap;

public class LinkedHashMapClass {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1,"Banana");
        linkedHashMap.put(2,"Pineapple");
        linkedHashMap.put(3,"Apple");
        linkedHashMap.put(4,"Orange");
        linkedHashMap.put(5,"Mango");
        linkedHashMap.put(6,"Watermelon");
        linkedHashMap.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });
        System.out.println(linkedHashMap.get(1));
        System.out.println(linkedHashMap.remove(2));
    }
}
