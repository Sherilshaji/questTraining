package com.quest.exceptionHandling;

import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        int num1=0;
        int num2=1;
        System.out.print(num1);
        for(int i=1;i<=10;i++){
            int num=num1+num2;
            System.out.print(" "+num2);
            num1=num2;
            num2=num;
        }
    }
}
