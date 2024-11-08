package com.quest.practice_vars;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number");
        double currentResult= sc.nextDouble();
        while(true) {
            double result = operations(currentResult);
            System.out.println(result);
            System.out.println("Do you want to perform another operation?(Yes/No)");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("Yes")) {
                operations(currentResult);
            } else if (answer.equalsIgnoreCase("No")) {
                System.out.println("Exiting program");
                break;
            } else {
                System.out.println("Invalid input");
            }
        }
    }

    public static double operations(double currentResult) {
        System.out.println("Current result: " + currentResult);
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square Root");
        System.out.println("6. Clear Current Result");
        System.out.println("7. Exit");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the number to add:");
                double addnum = sc.nextDouble();
                currentResult += addnum;
                break;
            case 2:
                System.out.println("Enter the number to subtract:");
                double subnum = sc.nextDouble();
                currentResult -= subnum;
                break;
            case 3:
                System.out.println("Enter the number to multiply:");
                double multnum = sc.nextDouble();
                currentResult *= multnum;
                break;
            case 4:
                System.out.println("Enter the number to divide:");
                double divnum = sc.nextDouble();
                if (divnum != 0) {
                    currentResult /= divnum;
                    break;
                } else {
                    System.out.println("Invalid input");
                }
            case 5:
                System.out.println("Enter the number to square root:");
                double sqrnum = sc.nextDouble();
                if (sqrnum < 0) {
                    System.out.println("Invalid input");
                    break;
                } else {
                    currentResult = sqrnum * sqrnum;
                    break;
                }
            case 6:
                currentResult = 0.0;
                break;
            case 7:
                System.out.println("Exiting the calculator");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        return currentResult;
    }

}
