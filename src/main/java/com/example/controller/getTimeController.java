package com.example.controller;

/*
Build a API service that shares back the current time in
India, USA, UK & Australia
 */
import com.example.bean.Country;
import com.example.service.IgetTimeService;
import com.example.service.getTimeService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

import java.util.List;

@Controller
public class getTimeController {
    @Inject
    private IgetTimeService getTimeService;

    @Get("/time")
    public List<Country> getAllCountriesTime(){
        return getTimeService.getCountryTime();
    }
}
