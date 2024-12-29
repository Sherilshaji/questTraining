package com.quest.practice_vars;

public class InsertSubString {
    public static void main(String[] args) {
        String str="Hello";
        String subStr="Hai";
        StringBuffer sb=new StringBuffer(str);
        sb.insert(2,subStr);
        System.out.println(sb);
    }
}
