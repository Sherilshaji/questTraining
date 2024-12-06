package com.quest.practice_vars;

import java.util.Arrays;

public class SwapElement {
    public static void main(String[] args) {
        int[] arr1 = {5,4,7,6,3};
        int[] arr2 = {2,7,5,4,9};
        System.out.println("Before swapping-");
        System.out.println("Array 1: "+Arrays.toString(arr1));
        System.out.println("Array 2: "+Arrays.toString(arr2));
        for (int i = 0; i < arr1.length; i++) {
            int temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp;
        }
        System.out.println("After swapping-");
        System.out.println("Array 1: "+Arrays.toString(arr1));
        System.out.println("Array 2: "+Arrays.toString(arr2));
    }
}
