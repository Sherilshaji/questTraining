package com.quest.bankAccManagement;

public class Withdraw extends Transaction{
    @Override
    public void process(double amount) {
        if (account == null) {
            System.out.println("No account found");
            return;
        }
        if(amount>0&&account.getBalance()>=amount){
            double newBalance=account.getBalance()-amount;
            account.setBalance(newBalance);
            System.out.println("New balance: "+newBalance);
        }else{
            System.out.println("Insufficient balance");
        }
    }
}
