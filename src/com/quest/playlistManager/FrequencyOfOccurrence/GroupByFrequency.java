package com.quest.playlistManager.FrequencyOfOccurrence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupByFrequency {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);
        Map<Integer,List<Integer>> result = groupByFrequency(list);
        System.out.println(result);
    }
    public static Map<Integer, List<Integer>> groupByFrequency(ArrayList<Integer> list) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : list) {
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else {
                map.put(i, 1);
            }
        }
        HashMap<Integer, List<Integer>> result = new HashMap<>();
        for(Integer i : map.keySet()) {
            int frequency = map.get(i);
            if(!result.containsKey(frequency)) {
                result.put(frequency, new ArrayList<>());
            }
            result.get(frequency).add(i);
        }
        return result;
    }
}
