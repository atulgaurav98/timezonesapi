package com.example.service;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@MicronautTest
public class getTimeServiceTest {
    @Inject
    private IgetTimeService getTimeService;
    @Test
    void getCountryTimeTest(){
        //test if 4 countries are being returned to controller
        Assertions.assertEquals(4,getTimeService.getCountryTime().size());
    }
}
