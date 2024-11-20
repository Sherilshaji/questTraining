package com.quest.libraryManagementSystemNew;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("--Library Management System--");
            System.out.println("1. Add Books");
            System.out.println("2. Add Members");
            System.out.println("3. Borrow Books");
            System.out.println("4. Return Books");
            System.out.println("5. Display Books");
            System.out.println("6. Display Members");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter ISBN: ");
                    String isbn = sc.next();
                    System.out.println("Enter Book Title: ");
                    String bookName = sc.next();
                    System.out.println("Enter Book Author: ");
                    String author = sc.next();

                    break;
                case 2:
                    System.out.println("Enter name: ");
                    String name = sc.next();
                    System.out.println("Enter member Id: ");
                    String memberId = sc.next();
                    System.out.println("1. Premium Membership");
                    System.out.println("2. Normal Membership");
                    System.out.println("Choose Membership Type: ");
                    int membershipType = sc.nextInt();

                    break;
                case 3:
                    System.out.println("Enter ISBN: ");
                    isbn = sc.next();
                    System.out.println("Enter Member Id: ");
                    memberId = sc.next();

                    break;
                case 4:
                    System.out.println("Enter ISBN: ");
                    isbn = sc.next();
                    System.out.println("Enter Member Id: ");
                    memberId = sc.next();

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    System.out.println("Exiting from program");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
