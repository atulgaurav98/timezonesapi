package com.example.bean;

import io.micronaut.context.annotation.InjectScope;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

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
