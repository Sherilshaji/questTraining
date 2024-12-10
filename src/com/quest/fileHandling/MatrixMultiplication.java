package com.quest.fileHandling;

import static com.quest.fileHandling.MatrixMultiplication.A;
import static com.quest.fileHandling.MatrixMultiplication.B;
import static com.quest.fileHandling.MatrixMultiplication.C;


public class MatrixMultiplication {
    static int[][] A={
            {1,2,3},
            {4,5,6},
            {7,8,9}
    };
    static int[][] B={
            {9,8,7},
            {6,5,4},
            {3,2,1}
    };
    static int[][] C=new int[A.length][B[0].length];

    public static void main(String[] args) {
        Thread t1=new Thread(new Row(0));
        Thread t2=new Thread(new Row(1));
        Thread t3=new Thread(new Row(2));
        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
class Row implements Runnable{

    int row;
    Row(int row){
        this.row=row;
    }

    @Override
    public void run() {
        for(int j=0;j< B[0].length;j++){
            for(int k=0;k<A[0].length;k++){
                C[row][j]+=A[row][k]*B[k][j];
            }
            System.out.print(C[row][j]+" ");
        }
        System.out.println();
    }
}


