package com.quest.practice_vars;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int[][] arr2 = new int[3][3];
        System.out.println("Enter the 3x3 array");
        for(int i=0;i<3;i++){
            int n=2;
            for(int j=0;j<3;j++){
                arr[i][j] = sc.nextInt();
                arr2[i][n] = arr[i][j];
                n--;
            }
        }
        for(int[] i:arr2){
                System.out.println(Arrays.toString(i));
        }
    }
}
