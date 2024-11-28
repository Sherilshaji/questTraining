package com.quest.TelecomSubManagementSystem;

import java.util.ArrayList;

public class TelecomManagement implements TSMSInterface {
    ArrayList<Subscriber> subscribers = new ArrayList<>();
    ArrayList<CallRecords> callRecords = new ArrayList<>();


    @Override
    public void addSub(Subscriber sub) {
        subscribers.add(sub);
        System.out.println("New subscriber added");
    }

    @Override
    public void updateSubBalance(int subID, double balance) {
        subscribers.forEach((subscriber)->{
            if(subscriber.getSubID()==subID&&subscriber.getPlanType().equalsIgnoreCase("Prepaid")){
                subscriber.setBalance(balance);
                System.out.println("New balance updated");
            }
        });
        System.out.println("Subscriber not found");
    }

    @Override
    public void listAllSubs() {
        if(subscribers.isEmpty()){
            System.out.println("No subscribers found");
        }else{
            subscribers.forEach((subscriber)->{
                System.out.println(subscriber.getSubName());
            });
        }
    }

    @Override
    public void addCallRecords(CallRecords cr) {
        callRecords.add(cr);
        System.out.println("New call records added");
    }

    @Override
    public void displayCallRecords(int subId) {
        callRecords.forEach(callRecords1 -> {
            if(callRecords1.getSubId()==subId){
                callRecords.forEach((callRecord)->{
                    System.out.println(callRecord);
                });
            }
        });
    }

    @Override
    public void generateBill(int subId) {
        Subscriber sc = null;
        double total=0;
        for(CallRecords cr : callRecords){
            if(cr.getSubId()==subId&&cr.getCallType().equalsIgnoreCase("Postpaid")){
                if(sc.getPlanType().equalsIgnoreCase("Local")){
                    total+=cr.getCallDuration()*1;
                } else if (sc.getPlanType().equalsIgnoreCase("STD")) {

                    total+=cr.getCallDuration()*2;
                } else if (sc.getPlanType().equalsIgnoreCase("ISD")) {
                    total+=cr.getCallDuration()*3;
                }
            }
        }
        System.out.println("Total bill amount for Postpaid Subscriber ID "+subId+" : "+total);
    }
}
