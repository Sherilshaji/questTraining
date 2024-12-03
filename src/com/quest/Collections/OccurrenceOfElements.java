package com.quest.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(1);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<list.size();i++){
            if(map.containsKey(list.get(i))){
                map.put(list.get(i), map.get(list.get(i))+1);
            }else{
                map.put(list.get(i), 1);
            }
        }
        System.out.println(map);
    }
}
