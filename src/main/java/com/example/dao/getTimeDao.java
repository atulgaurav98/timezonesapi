package com.example.dao;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
@Singleton
public class getTimeDao implements IgetTimeDao{
    @Override
    public Map<String, List<String>> getCountryZoneNames() {
        //List of cities of each country with varying timezones
        //Asia
        List<String> citiesIndia= Arrays.asList("Calcutta");

        //Europe
        List<String> citiesUK= Arrays.asList("London");

        //Australia
        List<String> citiesAustralia= Arrays.asList("Perth","Eucla","Darwin","Brisbane","Adelaide","Sydney");

        //America
        List<String> citiesUS= Arrays.asList("Adak","Anchorage","Phoenix","Chicago","Los_Angeles","New_York");

        //creating Zone ID maps for given countries :- India, United Kingdom, Australia, United States of America
        Map<String,List<String>> countriesAndCitiesZoneID=new HashMap<>();
        countriesAndCitiesZoneID.put("Asia",citiesIndia);
        countriesAndCitiesZoneID.put("Europe",citiesUK);
        countriesAndCitiesZoneID.put("Australia",citiesAustralia);
        countriesAndCitiesZoneID.put("America",citiesUS);

        return countriesAndCitiesZoneID;
    }
}
