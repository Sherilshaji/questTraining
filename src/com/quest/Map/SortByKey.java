package com.quest.Map;

import java.util.HashMap;
import java.util.TreeMap;

public class SortByKey {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("F", 1);
        map.put("D", 2);
        map.put("B", 3);
        map.put("A", 4);
        map.put("C", 5);
        System.out.println(map);
        TreeMap<String, Integer> sortedMap = new TreeMap<>(map);
        System.out.println(sortedMap);
    }
}
