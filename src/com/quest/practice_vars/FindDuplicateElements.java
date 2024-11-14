package com.quest.practice_vars;

import java.util.Arrays;

public class FindDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {10, 45, 20, 10, 20, 47, 11, 23, 26, 20, 11};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i] + " is a duplicate");
            }
        }
    }
}
