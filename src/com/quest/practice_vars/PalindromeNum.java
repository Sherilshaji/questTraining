package com.quest.practice_vars;

import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(isPalindrome(num)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
    public static boolean isPalindrome(int num) {
        int reversedNum=0;
        int number=num;
        while(num!=0){
            int num1=num%10;
            reversedNum=reversedNum*10+num1;
            num=num/10;
        }
        return reversedNum==number;
    }
}
