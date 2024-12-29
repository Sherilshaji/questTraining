package com.quest.practice_vars;

public class ReverseString {
    public static void main(String[] args) {
        String str="hello";
        char[] ch=str.toCharArray();
        System.out.println(ch);
        for(int i=0;i<str.length()/2;i++){
            char temp=ch[i];
            ch[i]=ch[str.length()-1-i];
            ch[str.length()-1-i]=temp;
        }
        System.out.println(ch);

    }
}
