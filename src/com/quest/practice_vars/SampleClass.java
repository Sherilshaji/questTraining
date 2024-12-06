package com.quest.practice_vars;

public class SampleClass implements Interface1, Interface2 {

    @Override
    public void method1() {
        System.out.println("method1 in SampleClass");
    }

    @Override
    public void method3() {
//        Interface2.super.method1();
        Interface2.super.method3();
        System.out.println("method3 in SampleClass");
    }

    public static void main(String[] args) {
        SampleClass sampleClass = new SampleClass();
        sampleClass.method1();
        sampleClass.method3();
        Interface1 interface1 = new SampleClass();
        interface1.method1();
    }
}
