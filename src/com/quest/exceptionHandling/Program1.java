package com.quest.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        division(sc);
        try{
            findElement(sc);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds");
        }

    }
    public static void division(Scanner sc) {
        try{
            System.out.println("Enter the number: ");
            double num1 = sc.nextInt();
            System.out.println("Enter the number to divide: ");
            double num2 = sc.nextInt();
            if(num2==0){
                throw new ArithmeticException("Division by zero");
            }
            double div = num1 / num2;
            System.out.println("Result: "+div);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception"+e.getLocalizedMessage());
        }catch (InputMismatchException e){
            System.out.println("Input Mismatch");
        } finally{
            System.out.println("Exception handling is complete.");
        }

    }
    public static void findElement(Scanner sc){
        int[] arr={2,5,7,1,3,6,8};
        try {
            System.out.println("Enter the index of the element: ");
            int index = sc.nextInt();
            int element = arr[index];
            System.out.println("The element is: " + element);
        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch. Please enter a valid integer index.");
            sc.nextLine();
        }
    }
}
