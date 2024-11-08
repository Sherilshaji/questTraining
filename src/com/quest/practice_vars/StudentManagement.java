package com.quest.practice_vars;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentManagement {
    final static int MAX_SCORE = 100;
    final static int MIN_STUDENTS = 0;
    final static int MAX_STUDENTS = 100;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= getValidStudentCount(sc);

        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            double[] scores = getScores(names, i, sc);
            if (scores == null) break;
            double totalScore=scores[0]+scores[1]+scores[2];
            System.out.println("Total score: "+totalScore);
            if(totalScore<50){
                break;
            }
            double avgScore=totalScore/3;
            System.out.println("Average score: "+avgScore);
            String grade="F";
            if(avgScore>=90&&avgScore<=MAX_SCORE){
                grade="A";
                System.out.println("Grade: "+grade);
                System.out.println("Excellent performance!");
            } else if (avgScore>=80&&avgScore<90) {
                grade="B";
                System.out.println("Grade: "+grade);
                System.out.println("Good job!");
            } else if (avgScore>=70&&avgScore<80) {
                grade="C";
                System.out.println("Grade: "+grade);
                System.out.println("You can do better!");
            } else if (avgScore>=60&&avgScore<70) {
                grade="D";
                System.out.println("Grade: "+grade);
                System.out.println("Need improvement!");
            } else {
                grade="F";
                System.out.println("Grade: "+grade);
                System.out.println("Failure. You need significant improvement!");
                System.out.println("Warning: Needs improvement in individual subjects.");
            }

        }
        System.out.println("Summary: "+n+" students processed.");
    }

    private static int getValidStudentCount(Scanner sc) {
        while(true){
            try{
                System.out.println("Enter the number of students: ");
                int n = sc.nextInt();
                if(n>MIN_STUDENTS&&n<=MAX_STUDENTS){
                    return n;
                }
            }catch(InputMismatchException e){
                System.out.println("Please enter a number between 1 and 100");
                sc.next();
            }
        }
    }

    private static double[] getScores(String[] names, int i, Scanner sc) {
        System.out.println("Enter the name of student: ");
        names[i] = sc.next();
        double[] scores=new double[3];
        String[] subjects={"math","english","science"};
        for(int j=0;j<3;j++){
            while(true){
                try{
                    System.out.println("Enter the "+subjects[j]+" score(0-100): ");
                    double score = sc.nextDouble();
                    if(Validation(score)){
                        scores[j]=score;
                        break;
                    }else{
                        System.out.println("Please enter a number between 1 and 100");
                    }
                }catch(InputMismatchException e){
                    System.out.println("Invalid input");
                    sc.next();
                }
            }
        }
        return scores;
    }

    public static boolean Validation(double score){
        if(score<MAX_SCORE&&score>0){
            return true;
        }else{
            return false;
        }
    }


}
