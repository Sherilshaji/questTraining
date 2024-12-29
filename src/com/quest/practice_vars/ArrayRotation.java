package com.quest.practice_vars;


public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};

        for (int j : arr) {
            System.out.print(j + " ");
        }

        int steps=2;

        int position= arr.length-steps;

        int[] arr2=new int[arr.length];
        int index=0;
        for(int i=position;i<arr.length;i++){
            arr2[index++]=arr[i];
        }
        for(int i=0;i<position;i++){
            arr2[index++]=arr[i];
        }

        System.out.println("\nNew array: ");
        for (int j : arr2) {
            System.out.print(j + " ");
        }
    }
}
