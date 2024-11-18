package com.quest.practice_vars;

public class pairOfNumbers {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 10, 30, 20, 50, 40, 40, 30, 30, 10};
        boolean[] visited = new boolean[arr.length];

        System.out.println("Output");
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        visited[j] = true;
                        count++;
                    }
                }
                int pairs = count / 2;
                if (pairs > 0) {
                    System.out.println(arr[i] + "'s - " + pairs);
                }
            }
        }
    }
}
