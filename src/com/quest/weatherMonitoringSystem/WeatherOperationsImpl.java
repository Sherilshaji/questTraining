package com.quest.weatherMonitoringSystem;

public class WeatherOperationsImpl extends Operations{
    private City[] city;
    private int cityCount;
    public WeatherOperationsImpl() {
        city = new City[10];
        cityCount = 0;
    }
    @Override
    public void display() {
        System.out.println("Displaying All Cities:");
        for (int i = 0; i < cityCount; i++) {
            System.out.println((i+1)+". City: "+city[i].getCityName()+", Temperature: "+city[i].getTemperature()+",Humidity: "+city[i].getHumidity()+"%, Condition: "+city[i].getCondition());
        }
    }

    @Override
    public void displayByCondition() {
        System.out.println("Generating Reports:");
        System.out.println("Cities grouped by condition:");
        for (String condition : new String[]{"Sunny", "Rainy", "Cloudy"}) {
            System.out.print("\n-> " + condition + " : ");
            boolean found = false;
            for (int i = 0; i < cityCount; i++) {
                if (city[i].getCondition().equalsIgnoreCase(condition)) {
                    System.out.print(city[i].getCityName() + " ");
                    found = true;
                }
            }
            if (!found) {
                System.out.print("None");
            }
        }
    }

    @Override
    public void addData(String cityName,double temp,double hum ,String condition) {
        if(cityCount<=10){
            city[cityCount++]=new City(cityName,temp,hum,condition);
            System.out.println("Added city");
        }
    }

    @Override
    public void highTemperature() {
        double maxTemp=city[0].getTemperature();
        String maxTempCity=city[0].getCityName();
        for (int i = 0; i < cityCount; i++) {
            if(city[i].getTemperature()>maxTemp) {
                maxTemp=city[i].getTemperature();
                maxTempCity=city[i].getCityName();
            }
        }
        System.out.println("City with the Highest Temperature: "+maxTempCity+" ("+maxTemp+"\u00B0C)");
    }

    @Override
    public void lowTemperature() {
        double minTemp=city[0].getTemperature();
        String minTempCity=city[0].getCityName();
        for (int i = 0; i < cityCount; i++) {
            if(city[i].getTemperature()<minTemp) {
                minTemp=city[i].getTemperature();
                minTempCity=city[i].getCityName();
            }
        }
        System.out.println("City with the Lowest Temperature: "+minTempCity+" ("+minTemp+"\u00B0C)");
    }

    @Override
    public void humidity() {
        System.out.println("Cities with Humidity > 80%:");
        boolean found = false;
        for (int i = 0; i < cityCount; i++) {
            if(city[i].getHumidity()>80) {
                found = true;
                System.out.println(city[i].getCityName());
            }
        }
        if (!found) {
            System.out.println("No cities found");
        }
    }

    @Override
    public void avgTemperature() {
        if (cityCount == 0) {
            System.out.println("No cities found");
            return;
        }
        double totalTemp=0;
        for (int i = 0; i < cityCount; i++) {
            totalTemp+=city[i].getTemperature();
        }
        System.out.println("\nAvg Temperature: "+(totalTemp/cityCount)+"\u00B0C");
    }

    @Override
    public void alert() {
        for (int i = 0; i < cityCount; i++) {
            if(city[i].getTemperature()>40) {
                System.out.println("Heatwave Alert: "+city[i].getCityName()+" is experiencing extreme heat ("+city[i].getTemperature()+"\u00B0C)!");
            }
            if(city[i].getHumidity()<20) {
                System.out.println("Humidity Drop: "+city[i].getCityName()+" is experiencing low humidity ("+city[i].getHumidity()+"%)!");
            }
        }
    }
}
