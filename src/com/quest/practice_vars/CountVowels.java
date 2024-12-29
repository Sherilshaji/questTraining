package com.quest.practice_vars;

public class CountVowels {
    public static void main(String[] args) {
        String str="Java Programming";
        String str1=str.replace(" ","").toLowerCase();
        char[] ch={'a','e','i','o','u'};
        char[] ch1=str1.toCharArray();
        System.out.println(ch1.length);
        int vowels=0;
        int consonants=0;
        for(int i=0;i<str1.length();i++){
            for(int j=0;j<ch.length;j++){
                if(ch1[i]==ch[j]){
                    vowels++;
                }
            }
        }
        consonants= ch1.length-vowels;
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+consonants);
    }
}
