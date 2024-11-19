package com.quest.bankAccManagement;

public abstract class Transaction {
    protected BankAccount account;

    public void setAccount(BankAccount account) {
        this.account = account;
    }
    public abstract void process(double amount);
}

