package com.quest.practice_vars;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingChara {
    public static void main(String[] args) {
        String str="swiss";
        char[] ch=str.toCharArray();
        Map<Character,Integer> map=new LinkedHashMap<>();
        for (char c : ch) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println("First non repeating character: "+entry.getKey());
                return;
            }
        }
    }
}
