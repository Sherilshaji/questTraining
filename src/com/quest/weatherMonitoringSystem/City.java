package com.quest.weatherMonitoringSystem;

public class City {
    private String cityName;
    private double temperature;
    private double humidity;
    private String condition;
    public City(String cityName, double temperature, double humidity, String condition) {
        this.cityName = cityName;
        this.temperature = temperature;
        this.humidity = humidity;
        this.condition = condition;
    }
    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public double getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public double getHumidity() {
        return humidity;
    }
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
    public String getCondition() {
        return condition;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }

}
