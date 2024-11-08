package com.quest.practice_vars;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        if(str==null){
            System.out.println("Empty string");
            return;
        }else{
            isPalindrome(str);
            if(isPalindrome(str)){
                System.out.println("Palindrome");
            }
            else{
                System.out.println("Not a palindrome");
            }
        }

    }
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
