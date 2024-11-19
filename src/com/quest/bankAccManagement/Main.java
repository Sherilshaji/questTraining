package com.quest.bankAccManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account=null;
        while(true){
        System.out.println("Bank Account Management System");
        System.out.println("1. Create Savings Account");
        System.out.println("2. Create Current Account");
        System.out.println("3. Deposit Money");
        System.out.println("4. Withdraw Money");
        System.out.println("5. Display Account Details");
        System.out.println("6. Exit");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                account= new SavingsAccount();
                System.out.println("Enter Account ID");
                account.setAccountNumber(sc.nextInt());
                sc.nextLine();
                System.out.println("Enter Account Holder Name");
                account.setAccountHolderName(sc.nextLine());
                account.setBalance(500);
                System.out.println("Successfully created savings account");
                break;
            case 2:
                account= new CurrentAccount();
                System.out.println("Enter Account ID");
                account.setAccountNumber(sc.nextInt());
                sc.nextLine();
                System.out.println("Enter Account Holder Name");
                account.setAccountHolderName(sc.nextLine());
                account.setBalance(0);
                System.out.println("Successfully created current account");
                break;
            case 3:
                if(account!=null){
                System.out.println("Enter amount to deposit");
                double amount = sc.nextDouble();
                Transaction deposit=new Deposit();
                deposit.setAccount(account);
                deposit.process(amount);
                }else{
                    System.out.println("No account found");
                }
                break;
            case 4:
                if(account!=null){
                    System.out.println("Enter amount to withdraw");
                    double amount1 = sc.nextDouble();
                    Transaction withdraw=new Withdraw();
                    withdraw.setAccount(account);
                    withdraw.process(amount1);
                }else{
                    System.out.println("No account found");
                }
                break;
            case 5:
                if(account!=null){
                    account.display();
                }else{
                    System.out.println("Account not found");
                }
                break;
            case 6:
                System.out.println("Exiting the program");
                System.exit(0);
            default:
                System.out.println("Invalid choice");
            }
        }
    }
}
