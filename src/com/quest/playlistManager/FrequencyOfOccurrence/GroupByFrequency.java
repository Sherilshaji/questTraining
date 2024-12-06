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













    public static void sample(){
        class FrequencyGrouper {

            public static Map<Integer, List<Integer>> groupByFrequency(List<Integer> numbers) {
                Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();//will be used to store each num and its freq
                for (Integer num : numbers) { //numbers is containing the list so iterate the list
                    if (frequencyMap.containsKey(num)) {//cheching if curr num alredy exist in the map
                        frequencyMap.put(num, frequencyMap.get(num) + 1);//if found increment the freq by 1
                    } else {
                        frequencyMap.put(num, 1);//else add the num and initialize the freq as 1
                    }
                }
                //so this will give a map of all the mum and its freq

                Map<Integer, List<Integer>> grpByFrq = new HashMap<>();
                for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {//want to iterate through each key and val pair
                    int number = entry.getKey();//[1,2,3]-numbers
                    int frequency = entry.getValue();
                    if (!grpByFrq.containsKey(frequency)) {//checking freq is alredy a key if not adding the freq as key
                        grpByFrq.put(frequency, new ArrayList<>());
                    }
                    grpByFrq.get(frequency).add(number);
                }
                return grpByFrq;
            }
        }
    }

}
