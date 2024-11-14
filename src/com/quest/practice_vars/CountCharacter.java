package com.quest.practice_vars;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        boolean[] counted = new boolean[ch.length];
        for (int i = 0; i < ch.length; i++) {
            if(counted[i]) continue;
            int count=1;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                    counted[j]=true;
                }
            }
            System.out.println(ch[i]+" - "+count);
        }
    }
}
