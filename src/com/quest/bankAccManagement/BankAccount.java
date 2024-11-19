package com.quest.bankAccManagement;

public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public int getAccountNumber() {
        return accountNumber;
    }
    public String getName(){
        return accountHolderName;
    }
    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public void setBalance(double balance){
        if(balance>=0){
            this.balance = balance;
        }else{
            System.out.println("Balance should not be negative");
        }
    }
    public void display(){
        System.out.println("Account number: "+accountNumber);
        System.out.println("Account holder name: "+accountHolderName);
        System.out.println("Balance: "+balance);
    }
}
