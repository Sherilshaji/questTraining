package com.quest.bankAccManagement;

public class CurrentAccount extends BankAccount{
    private static final double minBalance=0;
    public void setBalance(double balance) {
        if(balance<minBalance){
            System.out.println("Not enough balance");
        }else{
            super.setBalance(balance);
            super.display();
        }
    }
}
