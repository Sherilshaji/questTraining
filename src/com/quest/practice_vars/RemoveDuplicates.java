package com.quest.practice_vars;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str="programming";
        char[] ch=str.toCharArray();
        String result="";
        for(int i=0;i< ch.length;i++){
            boolean flag=false;
            for(int j=0;j<result.length();j++){
                if(ch[i]==result.charAt(j)){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                result+=ch[i];
            }
        }
        System.out.println(result);
    }
}
