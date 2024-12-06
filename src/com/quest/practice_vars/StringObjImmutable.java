package com.quest.practice_vars;

public class StringObjImmutable {
    public static void main(String[] args) {
        String a="abcd";
        String b=a;
        a=a+"ef";
        System.out.println(a==b);
    }
}
