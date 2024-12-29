package com.quest.practice_vars;

public class SmallestNum {
    public static void main(String[] args) {
        int[] arr={25,16,27,30,11,9,12,20};
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest number: "+smallest);
    }
}
