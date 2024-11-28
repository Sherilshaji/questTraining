package com.quest.TelecomSubManagementSystem;

import java.io.Serializable;
import java.time.LocalTime;

public class CallRecords implements Serializable {
    private int subId;
    private String callType;
    private int callDuration;
    private String timeStamp;
    public CallRecords(int subId,String callType, int callDuration) {
        this.subId = subId;
        this.callType = callType;
        this.callDuration = callDuration;
        this.timeStamp = LocalTime.now().toString();
    }

    public int getSubId() {
        return subId;
    }

    public void setSubId(int subId) {
        this.subId = subId;
    }

    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType;
    }

    public int getCallDuration() {
        return callDuration;
    }

    public void setCallDuration(int callDuration) {
        this.callDuration = callDuration;
    }

    public String getCallTime() {
        return timeStamp;
    }

    public void setCallTime(String callTime) {
        this.timeStamp = callTime;
    }
    public String toString() {
        return "Call Records: Subscriber ID: "+subId+", Call Type:  "+callType+", Call Duration: "+callDuration+", Time Stamp: "+timeStamp;
    }
}
