package com.quest.weatherMonitoringSystem;

public interface Operations {
    void display();
    void displayByCondition();
    void addData(String cityName,double temp, double humidity,String condition);
    void highTemperature();
    void lowTemperature();
    void humidity();
    void avgTemperature();
    void alert();
}
