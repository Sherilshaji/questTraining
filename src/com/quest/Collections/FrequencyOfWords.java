package com.quest.Collections;

import java.util.HashMap;

public class FrequencyOfWords {
    public static void main(String[] args) {
        String sentence="Java is fun and java is powerful";
        sentence=sentence.toLowerCase();
        String[] words=sentence.split(" ");
        HashMap<String,Integer> wordFrequency=new HashMap<>();
        for(String word:words){
            if(wordFrequency.containsKey(word)){
                int freq=wordFrequency.get(word)+1;
                wordFrequency.put(word,freq);
            }else{
                wordFrequency.put(word,1);
            }
        }
        for(String word:wordFrequency.keySet()){
            System.out.println(word+" "+wordFrequency.get(word));
        }
    }
}
