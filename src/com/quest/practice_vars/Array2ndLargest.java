package com.quest.practice_vars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array2ndLargest {
    public static void main(String[] args) {
        int[] arr1={4,2,6,7,8,6,10,1,7};
        Arrays.sort(arr1);
        for(int i=arr1.length-1;i>=0;i--){
            if(arr1[i]>arr1[i-1]){
                System.out.println(arr1[i-1]);
                break;
            }
        }
    }

//    public static class ArrayRotation {
//        public static void main(String[] args) {
//            List<Integer> list=new ArrayList<>();
//            list.add(5);
//            list.add(2);
//            list.add(8);
//            list.add(1);
//            list.add(3);
//
//            list.forEach(System.out::println);
//            int position=2;
//
//            List<Integer> list2=new ArrayList<>();
//            for(int i=position;i<list.size();i++){
//                    list2.add(list.get(i));
//            }
//            for(int i=0;i<position;i++){
//                list2.add(list.get(i));
//            }
//            System.out.print("Starting from position "+position);
//            list2.forEach(System.out::print);
//        }
//    }
}
