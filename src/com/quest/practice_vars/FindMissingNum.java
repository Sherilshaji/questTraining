package com.quest.practice_vars;

public class FindMissingNum {
    public static void main(String[] args) {

        int N=6;
        int[] arr1={1,2,4,5,6};
        for(int i=1;i<=N;i++){
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
