package com.example.dao;

import com.example.service.IgetTimeService;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@MicronautTest
public class getTimeDaoTest {
    @Inject
    private IgetTimeDao getTimeDao;
    @Test
    void getCountryTimeTest(){
        //test for 4 countries
        Assertions.assertEquals(4,getTimeDao.getCountryZoneNames().keySet().size());
        //test for all cities of countries
        Assertions.assertEquals(1,getTimeDao.getCountryZoneNames().get("Asia").size());
        Assertions.assertEquals(1,getTimeDao.getCountryZoneNames().get("Europe").size());
        Assertions.assertEquals(6,getTimeDao.getCountryZoneNames().get("Australia").size());
        Assertions.assertEquals(6,getTimeDao.getCountryZoneNames().get("America").size());
    }
}
