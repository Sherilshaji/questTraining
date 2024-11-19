package com.quest.bankAccManagement;

public class Deposit extends Transaction {

    @Override
    public void process(double amount) {
        if (account == null) {
            System.out.println("No account found");
        }
        if (amount > 0) {
            double newBalance = account.getBalance() + amount;
            account.setBalance(newBalance);
            System.out.println("New balance: " + newBalance);
        }else{
            System.out.println("Insufficient balance");
        }
    }
}
