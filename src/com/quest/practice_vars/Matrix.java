package com.quest.practice_vars;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr=new int[3][3];
        int n=1;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=n++;
            }
        }
        printMatrix(arr);
        System.out.println("1. Search");
        System.out.println("2. Sort");
        System.out.println("Enter your choice");
        int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    String searchResult = search(arr, sc);
                    System.out.println(searchResult);
                    break;
                case 2:
                    int[][] sortResult=sort(arr);
                    System.out.println("Sorted matrix:");
                    printMatrix(sortResult);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
    }

    public static String search(int[][] arr,Scanner sc){
        System.out.println("Enter the element to search: ");
        int n=sc.nextInt();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j]==n){
                    return "Element found at index: ["+i+"]["+j+"]";
                }
            }
        }
        return "Element not found";
    }
    public static int[][] sort(int[][] arr){
        int rows=arr.length;
        int cols=arr[0].length;
        int[] tempResult=new int[rows*cols];
        int index=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                    tempResult[index++]=arr[i][j];
            }
        }
        index=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=tempResult[index++];
            }
        }
        return arr;
    }
    public static void printMatrix(int[][] arr){
        for(int[] i:arr){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
