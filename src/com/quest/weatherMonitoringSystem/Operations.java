package com.quest.weatherMonitoringSystem;

public abstract class Operations {
    public abstract void display();
    public abstract void displayByCondition();
    public abstract void addData(String cityName,double temp, double humidity,String condition);
    public abstract void highTemperature();
    public abstract void lowTemperature();
    public abstract void humidity();
    public abstract void avgTemperature();
    public abstract void alert();
}
