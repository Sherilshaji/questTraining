package com.quest.Thread;

public class BankAccountSimulation {
    public static void main(String[] args) {
        BankAccount account=new BankAccount("123456789",1000);
        Thread t1=new Thread(new AccountTransaction(account,true,200));
        Thread t2=new Thread(new AccountTransaction(account,false,500));
        Thread t3=new Thread(new AccountTransaction(account,false,1000));
        try{
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
class AccountTransaction implements Runnable{

    private BankAccount account;
    private boolean isDeposit;
    private double amount;

    public AccountTransaction(BankAccount account, boolean isDeposit, double amount) {
        this.account = account;
        this.isDeposit = isDeposit;
        this.amount = amount;
    }
    @Override
    public void run() {
        if(isDeposit){
            account.deposit(amount);
        }else{
            account.withdraw(amount);
        }
    }
}
class BankAccount{
    double balance;
    String accNumber;
    public BankAccount(String accNumber,double balance){
        this.accNumber=accNumber;
        this.balance=balance;
    }
    public synchronized void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println(Thread.currentThread().getName()+" withdrew: "+amount+" Balance: "+balance);
        }else{
            System.out.println("Insufficient balance: "+balance);
        }
    }
    public synchronized void deposit(double amount){
        balance+=amount;
        System.out.println(Thread.currentThread().getName()+" deposited: "+amount+" Balance: "+balance);
    }
}
