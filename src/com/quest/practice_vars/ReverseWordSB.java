package com.quest.practice_vars;

public class ReverseWordSB {
    public static void main(String[] args) {
        String str="Hello";
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            result.append(sb.reverse()).append(" ");
        }
        System.out.println(result);
    }
}
