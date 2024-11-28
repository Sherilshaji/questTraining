package com.quest.Map;

import java.util.TreeMap;

public class TreeMapClass {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(1,"A");
        treeMap.put(2,"B");
        treeMap.put(3,"C");
        treeMap.put(4,"D");
        treeMap.put(5,"E");
        treeMap.put(6,"F");
        treeMap.forEach((key,value)->System.out.println(key+" "+value));
    }
}
