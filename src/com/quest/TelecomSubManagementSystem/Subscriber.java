package com.quest.TelecomSubManagementSystem;

import java.io.Serializable;

public class Subscriber implements Serializable {
    private int subID;
    private String subName;
    private String number;
    private String planType;
    private double balance;
    public Subscriber(int subID, String subName, String number, String planType, double balance) {
        this.subID = subID;
        this.subName = subName;
        this.number = number;
        this.planType = planType;
        this.balance = balance;
    }

    public int getSubID() {
        return subID;
    }

    public void setSubID(int subID) {
        this.subID = subID;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString() {
        return "Subscriber [subID=" + subID + ", subName=" + subName + ", phnumber=" + number + ", planType=" + planType + ", balance=" + balance + "]";
    }
}
