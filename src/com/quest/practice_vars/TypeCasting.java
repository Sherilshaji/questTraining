package com.quest.practice_vars;

public class TypeCasting {
    public static void main(String[] args) {
        //implicit
        int a=5;
        double b=a;
        System.out.println(b);

        //explicit
        double c=9.78;
        int d=(int)c;
        System.out.println(d);

        int f=200;
        byte e=(byte)f;
        System.out.println(e);
    }
}
