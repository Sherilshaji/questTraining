package com.quest.practice_vars;


import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] arr={3,8,4,6,9,15,32,1,7};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]&&i%2==0){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            } else if (i%2!=0&&arr[i]<arr[i+1]) {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
