package com.quest.practice_vars;

import java.util.Arrays;

public class Array2ndLargest {
    public static void main(String[] args) {
        int[] arr1={4,2,6,7,8,6,10,1,7};
        Arrays.sort(arr1);
        for(int i=arr1.length-1;i>=0;i--){
            if(arr1[i]>arr1[i-1]){
                System.out.println(arr1[i-1]);
                break;
            }
        }
    }
}
