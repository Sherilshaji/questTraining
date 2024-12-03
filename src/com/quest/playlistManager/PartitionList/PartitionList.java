package com.quest.playlistManager.PartitionList;

import java.util.ArrayList;
import java.util.List;

public class PartitionList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        int size=3;
        List<List<Integer>> result=partition(numbers,size);
        System.out.println(result);
    }
    public static List<List<Integer>> partition(List<Integer> numbers,int size) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i+=size) {
            int end=Math.min(i+size,numbers.size());
            result.add(new ArrayList<>(numbers.subList(i, end)));
        }
        return result;
    }
}
