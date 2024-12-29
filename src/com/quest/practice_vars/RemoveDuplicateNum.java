package com.quest.practice_vars;

public class RemoveDuplicateNum {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,4,5};
        int[] sortedArray=sort(arr);
        int[] result = new int[arr.length];
        int n=0;
        for(int i=0;i<arr.length-1;i++){
            if(sortedArray[i]!=sortedArray[i+1]){
                result[n++]=sortedArray[i];
            }
        }
        result[n++]=sortedArray[sortedArray.length-1];
        for(int i=0;i<n;i++){
            System.out.print(result[i]+" ");
        }
    }
    public static int[] sort(int[] arr){
        int n=arr.length;
        for(int i=0;i< n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
