package com.quest.TelecomSubManagementSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TSMSInterface tm = new TelecomManagement();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--Telecom Subscriber Management System--");
            System.out.println("1. Add Subscriber");
            System.out.println("2. Update Balance");
            System.out.println("3. List all Subscribers");
            System.out.println("4. Add Call Records");
            System.out.println("5. Display Call Records");
            System.out.println("6. Generate Bill");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");
            try {
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter Subscriber ID: ");
                        int id = sc.nextInt();
                        System.out.println("Enter Subscriber Name: ");
                        String name = sc.next();
                        System.out.println("Enter Phone Number: ");
                        String phone = sc.next();
                        System.out.println("Enter Plan Type: ");
                        String planType = sc.next();
                        System.out.println("Enter Balance: ");
                        double balance = sc.nextInt();
                        tm.addSub(new Subscriber(id, name, phone, planType, balance));
                        break;
                    case 2:
                        System.out.println("Enter Subscriber ID: ");
                        id = sc.nextInt();
                        System.out.println("Enter New Balance");
                        balance = sc.nextDouble();
                        tm.updateSubBalance(id, balance);
                        break;
                    case 3:
                        System.out.println("List of Subscriber");
                        tm.listAllSubs();
                        break;
                    case 4:
                        System.out.println("Enter Subscriber ID: ");
                        id = sc.nextInt();
                        System.out.println("Enter Call Type: ");
                        planType = sc.next();
                        System.out.println("Enter Duration: ");
                        int duration = sc.nextInt();
                        tm.addCallRecords(new CallRecords(id, planType, duration));
                        break;
                    case 5:
                        System.out.println("Enter Subscriber ID: ");
                        id = sc.nextInt();
                        tm.displayCallRecords(id);
                        break;
                    case 6:
                        System.out.println("Enter Subscriber ID: ");
                        id = sc.nextInt();
                        tm.generateBill(id);
                        break;
                    case 7:
                        System.out.println("Exit");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice");
                }
            }catch (InputMismatchException e) {
                System.out.println("Input mismatch exception");
            }
        }
    }
}
