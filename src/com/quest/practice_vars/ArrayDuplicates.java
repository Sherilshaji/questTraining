package com.quest.practice_vars;

public class ArrayDuplicates {
    public static void main(String[] args) {

        int[] arr1 = {2,6,8,5,9};
        for(int i=1;i<=10;i++){
            boolean flag=false;
            for (int k : arr1) {
                if (i == k) {
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.print(" "+i);
            }
        }
    }
}
