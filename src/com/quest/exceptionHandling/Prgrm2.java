package com.quest.exceptionHandling;

import java.io.IOException;

public class Prgrm2 extends Program2{

    public Prgrm2(String str) {
        super(str);
    }

    @Override
    public void method1(){
        System.out.println("Prgrm2 method1: "+getStr());
    }


    public static void main(String[] args) {
        try {
            Program2 program2 = new Program2("Hello");
            program2.method1();
            Program2 prgrm2=new Prgrm2("Hai");
            prgrm2.method1();

            System.out.println("Performing Division");
            method2(10,0);
        }catch (ArithmeticException e) {
            System.out.println("Error: "+e.getMessage());
        }

        try{
            System.out.println("Validating input");
            method3(10);
        }catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }


    public static void method2(int num1, int num2){
        if(num2==0){
            throw new ArithmeticException("num should not be zero");
        }
        System.out.println(num1/num2);
    }


    public static void method3(int max) throws IOException {
        int max_Count=5;
        if(max>max_Count){
            throw new IOException("Number exceeds max number.");
        }
    }
}
