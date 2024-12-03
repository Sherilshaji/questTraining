package com.quest.Map;

import java.util.HashMap;

public class OccurrenceOfChara {
    public static void main(String[] args) {
        String str="Hello World";
        str=str.toLowerCase();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isWhitespace(ch)){
                continue;
            }
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        System.out.println(map);
    }
}
