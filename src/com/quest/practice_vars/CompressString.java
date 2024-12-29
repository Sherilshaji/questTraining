package com.quest.practice_vars;

public class CompressString {
    public static void main(String[] args) {
        String str="aaabb";
        int count=1;
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        sb.append(str.charAt(str.length()-1)).append(count);
        System.out.println(sb.length()<str.length()?sb.toString():str);
    }
}
