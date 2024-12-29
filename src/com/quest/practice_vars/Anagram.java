package com.quest.practice_vars;


public class Anagram {
    public static void main(String[] args) {
        String str1="Listen";
        String str2="silent";

        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        char[] sortedCh1=sort(ch1);
        char[] sortedCh2=sort(ch2);

        boolean flag=false;
        if(ch1.length==ch2.length){
            for(int i=0;i<ch1.length;i++){
                if(sortedCh1[i]==sortedCh2[i]){
                    flag=true;
                }
            }
        }
        System.out.println(flag);
    }
    public static char[] sort(char[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    char temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
