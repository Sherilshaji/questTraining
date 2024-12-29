package com.quest.practice_vars;

import java.util.Arrays;

public class RemoveVowels {
    public static void main(String[] args) {
        String str="Hello";
        StringBuilder sb=new StringBuilder();
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(!"aeiou".contains(String.valueOf(ch[i]))){
                sb.append(ch[i]);
            }
        }
        System.out.println(sb);
    }
}
