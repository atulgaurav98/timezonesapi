package com.example.bean;

public class Zone {

    private String city;
    private String currentDateTime;

    public Zone() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCurrentDateTime() {
        return currentDateTime;
    }

    public void setCurrentDateTime(String currentDateTime) {
        this.currentDateTime = currentDateTime;
    }

    @Override
    public String toString() {
        return "Zone [city=" + city + ", currentTime=" + currentDateTime + "]";
    }

}
