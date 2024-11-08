package com.quest.practice_vars;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        if(n<1){
            System.out.println("Invalid number");
            return;
        }
        int n1=0;
        int n2=1;
        for(int i=0;i<=n;i++){
            System.out.println(n1);
            int n3=n1+n2;
            n1=n2;
            n2=n3;
        }
    }
}
