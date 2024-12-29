package com.quest.practice_vars;

public class LongestSubarray {
    public static void main(String[] args) {
        int[][] arr={
                {3,6,1,7,3,5},
                {8,2,3,6,1,1,4},
                {9,7,3,5,4}
        };
        int sum=25;
        int longest=0;
        for(int[] row:arr){
            for(int i=0;i< row.length;i++){
                int subArrSum=0;
                for(int j=i;j<row.length;j++){
                    subArrSum+=row[j];
                    if(sum==subArrSum){
                        int length=j-i+1;
                        if(length>longest){
                            longest=length;
                        }
                    }
                }
            }
        }
        System.out.println("Longest subarray: "+longest);
    }
}
