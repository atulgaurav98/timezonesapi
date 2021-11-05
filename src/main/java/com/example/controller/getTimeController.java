package com.example.controller;


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
