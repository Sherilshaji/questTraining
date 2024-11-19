package com.quest.bankAccManagement;

public class SavingsAccount extends BankAccount {
    private static final double minBalance=500;

    @Override
    public void setBalance(double balance) {
        if(balance<minBalance){
            System.out.println("Not enough balance");
        }else{
            super.setBalance(balance);
            super.display();
        }
    }
}
