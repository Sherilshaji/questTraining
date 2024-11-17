package com.quest.practice_vars;

public class StudentScores {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace"};
        int[] ages = {20, 21, 22, 23, 24, 25, 26};
        int[][] scores = {
                {85, 90, 78, 92, -1},
                {88, 92, 80, -1, 85},
                {75, 80, 70, 60, 72},
                {90, 85, 88, 95, 92},
                {65, 70, 60, 68, 67},
                {80, 85, -1, 90, 95},
                {90, 88, 92, 85, 80}
        };
        double[] averages = avgScore(names, scores,ages);
        highestScore(names, averages);
        rankOfStudents(names, averages);
        detectMissingData(names, scores);
    }

    public static double[] avgScore(String[] names, int[][] scores,int[] ages) {
        System.out.println("Average Scores: ");
        double[] average = new double[names.length];
        for (int i = 0; i < names.length; i++) {
            double totalScore = 0;
            int count = 0;
            for (int j : scores[i]) {
                if (j != -1) {
                    count++;
                    totalScore += j;
                }
            }
            average[i] = totalScore / count;
            System.out.println("Average score of " + names[i] + " | "+ages[i]+" = " + average[i]);
        }
        return average;
    }

    public static void highestScore(String[] names, double[] averages) {
        System.out.println("Highest Scores: ");
        int n=0;
        for (int i=0;i< names.length;i++) {
            if (averages[i]>n) {
                n = i;
            }
        }
        System.out.println(names[n] + " got the highest average score with " + averages[n]);
    }

    public static void rankOfStudents(String[] names, double[] averages) {
        System.out.println("Rank of Students: ");
        String[] sortedNames = names.clone();

        for(int i=0;i<averages.length-1;i++) {
            for(int j=i+1;j<averages.length;j++) {
                if(averages[i]>averages[j]) {

                    String tempName = sortedNames[i];
                    sortedNames[i] = sortedNames[j];
                    sortedNames[j] = tempName;
                }
            }
        }
        for(int i=0;i<sortedNames.length;i++) {
            System.out.println((i+1)+". "+sortedNames[i]);
        }
    }
    public static void detectMissingData(String[] names, int[][] scores) {
        System.out.println("Missing Data Report: ");
        boolean foundMissing=false;
        for(int i=0;i<names.length;i++) {
            for(int j=0;j<scores[i].length;j++) {
                if (scores[i][j] == -1) {
                    System.out.println("Missing subject "+ (j+1)+" for " + names[i]);
                    foundMissing=true;
                }
            }
        }
        if(!foundMissing) {
            System.out.println("No missing data found.");
        }
    }
}
