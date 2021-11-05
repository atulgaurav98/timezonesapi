package com.example.dao;

import jakarta.inject.Inject;

import java.util.List;
import java.util.Map;

public interface IgetTimeDao {

    public Map<String, List<String>> getCountryZoneNames();
}
