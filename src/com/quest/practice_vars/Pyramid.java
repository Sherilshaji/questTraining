package com.quest.practice_vars;

public class Pyramid {
    public static void main(String[] args) {
        for(int i=0;i<8;i++){
            System.out.println();
            for(int j=1;j<2*(8-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<2*i;k++){
                System.out.print("* ");
            }
        }

    }
}
