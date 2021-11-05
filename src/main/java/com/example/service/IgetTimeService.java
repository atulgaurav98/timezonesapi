package com.example.service;

import com.example.bean.Country;
import jakarta.inject.Inject;

import java.util.List;

public interface IgetTimeService {

    public List<Country> getCountryTime();
}
