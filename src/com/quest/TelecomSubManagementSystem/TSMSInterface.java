package com.quest.TelecomSubManagementSystem;

public interface TSMSInterface {
    void addSub(Subscriber sub);
    void updateSubBalance(int subID, double balance);
    void listAllSubs();
    void addCallRecords(CallRecords cr);
    void displayCallRecords(int subId);
    void generateBill(int subId);
}
