package com.quest.practice_vars;

public class SecondLargestNum {
    public static void main(String[] args) {
        int[] arr={10,20,4,45,99,99};
        int max=arr[0];
        int secMax=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secMax=max;
                max=arr[i];
            } else if (arr[i]>secMax && arr[i]!=max) {
                secMax=arr[i];
            }
        }

        System.out.println(secMax);

    }
}
