package com.quest.oops.test2;

public class B {
    void add(int a, int b) {
        int c = a + b;
        System.out.println("B class add: "+c);
    }
    void add(){
        System.out.println("B class add no arguments");
    }
    static void add(int a){
        System.out.println("A class add method"+a);
    }
}
