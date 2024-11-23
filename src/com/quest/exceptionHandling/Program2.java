package com.quest.exceptionHandling;

public class Program2 {
    private String str;

    public Program2(String str) {
        this.str = str;
    }
    public String getStr() {
        return str;
    }
    public void method1() {
        System.out.println("Program2 method1: "+str);
    }

}
