package com.quest.practice_vars;

public class NumberOfOccurrence {
    public static void main(String[] args) {
        int[] arr ={10,20,10,20,40,10,30,40,50};
        boolean[] visited = new boolean[arr.length];
        System.out.println("Element - Occurrence:");
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        visited[j] = true;
                        count++;
                    }
                }
                System.out.println(arr[i] + " - " + count);
            }
        }

    }
}
