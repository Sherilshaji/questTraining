package com.quest.practice_vars;

public class OccurenceOfWord {
    public static void main(String[] args) {
        String str="Java is powerfull, java is simple.";
        String word="Java";
        String[] words=str.split(" ");
        int count=0;
        for(String n:words){
            if(word.equalsIgnoreCase(n)){
                count++;
            }
        }
        System.out.println("Occurence of "+word+" : "+count);
    }
}
