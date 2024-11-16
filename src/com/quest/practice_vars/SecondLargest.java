package com.quest.practice_vars;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={4,2,7,10,11,10,5,11,9};
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i-1]<arr[i]){
                System.out.println("Second largest element: "+arr[i-1]);
                break;
            }
        }
    }
}
