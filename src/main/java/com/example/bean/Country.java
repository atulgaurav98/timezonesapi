package com.example.bean;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private String country;
    private List<Zone> timezones = new ArrayList<>();

    public Country() {
    }

    public List<Zone> getTimezones() {
        return timezones;
    }

    public void setTimezones(List<Zone> timezones) {
        this.timezones = timezones;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


}
