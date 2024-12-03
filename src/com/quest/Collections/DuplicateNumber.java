package com.quest.Collections;

import java.util.HashSet;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] numbers={5,6,2,7,1,9,3,4,5};
        HashSet<Integer> set = new HashSet<>();
        for (int number : numbers) {
            if(set.contains(number)){
                System.out.println("Duplicate numbers: "+number);
                break;
            }
            set.add(number);
        }
    }
}