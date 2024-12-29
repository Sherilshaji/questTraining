package com.quest.practice_vars;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str="radar";
        char[] ch=str.toCharArray();
        boolean flag=false;
        for(int i=0;i<str.length()/2;i++){
            if(ch[i]==ch[str.length()-1-i]){
                flag=true;
            }
        }
        if(flag){
            System.out.println(flag);
        }else{
            System.out.println(flag);
        }
    }
}
