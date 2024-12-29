package com.quest.practice_vars;

public class StringReverse {
    public static void main(String[] args) {
        String str="Hello123 World!";
        char[] ch=str.toCharArray();
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(!Character.isLetterOrDigit(ch[left])){
                left++;
            } else if (!Character.isLetterOrDigit(ch[right])) {
                right--;
            }else {
                char temp=ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;
            }
        }
        System.out.println(new String(ch));
    }
}
