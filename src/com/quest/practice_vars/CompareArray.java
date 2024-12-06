package com.quest.practice_vars;

import java.util.Arrays;

public class CompareArray {
    public static void main(String[] args) {
        int[] arr1 = {5,4,2,3,7,8,9};
        int[] arr2 = {9,4,3,5,2,7,8};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean flag=true;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                flag=false;
                break;
            }
        }
        if(!flag){
            System.out.println("Arrays are not equal");
        }else {
            System.out.println("Arrays are equal");
        }
    }
}
