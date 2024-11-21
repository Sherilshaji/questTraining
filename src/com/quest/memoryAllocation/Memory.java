package com.quest.memoryAllocation;

public class Memory {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello World";

        String s3=new String("Hello");
        String s4=new String("World");
        check(s3,s4);

        int i1=1;
        int i2=1;

        check2(i1,i2);

        check3(s1,s2);
    }
    public static void check(String s1,String s2){
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
    public static void check2(int i1,int i2){
        if(i1==i2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    public static void check3(String s1,String s2){
        if(s1.equals(s2)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        if(s2.contains(s1)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
