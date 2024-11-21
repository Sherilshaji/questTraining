package com.quest.stringprograms;

public class StringClass {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        check(s1, s2);
    }

    private static void check(String s1, String s2) {
        if(s1.equals(s2)){
            System.out.println("s1 equals s2");
        }else{
            System.out.println("s1 not equals s2");
        }
        if(s1 == s2){
            System.out.println("s1 == s2");
        }else{
            System.out.println("s1 != s2");
        }
    }
}
