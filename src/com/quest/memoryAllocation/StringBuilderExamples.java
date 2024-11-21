package com.quest.memoryAllocation;

public class StringBuilderExamples {
    public static void main(String[] args) {
        StringBuilder s1=new StringBuilder("hello");
        StringBuilder s2=new StringBuilder("world");


        System.out.println(s1.append("world"));
        System.out.println(s2.replace(0,10,"h"));
        System.out.println(s1.reverse());
        System.out.println(s2.delete(1,3));
        System.out.println(s2.insert(0,"Hello"));
        System.out.println(s2.charAt(0));
//        check(s1,s2);
        String s3="hello";
        String s4="world";
        String s5=s3+s4;
        System.out.println(s5);
    }

    public static void check(StringBuilder s1,StringBuilder s2) {
        if(s1==s2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        if(s1.equals(s2)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
