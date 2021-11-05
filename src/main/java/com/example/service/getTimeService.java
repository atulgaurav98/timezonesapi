package com.example.service;

import com.example.bean.Country;
import com.example.bean.Zone;
import com.example.dao.IgetTimeDao;
import com.example.dao.getTimeDao;
import io.micronaut.context.BeanContext;
import io.micronaut.context.annotation.Context;
import io.micronaut.context.annotation.InjectScope;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Singleton
public class getTimeService implements IgetTimeService{
    private DateTimeFormatter d = DateTimeFormatter.ofPattern("dd MMM yyyy,hh:mm:ss a");
    @Inject
    private IgetTimeDao getTimeDao;
    //private IgetTimeDao getTimeDao=new getTimeDao();
    @Override
    public List<Country> getCountryTime() {
        List<Country> listOfAllCountries=new ArrayList<>();
        Map<String, List<String>> countryZoneNames=getTimeDao.getCountryZoneNames();

        for (Map.Entry mapElement :
                countryZoneNames.entrySet()) {
            String key=(String)mapElement.getKey();
            List<String> valueList=(List)mapElement.getValue();

            Country c = new Country();

            c.setCountry(key);
            for (String s :
                    valueList) {

                Zone z=new Zone();
                z.setCity(s);
                LocalDateTime t = LocalDateTime.now(ZoneId.of(key+"/"+s));
                z.setCurrentDateTime(t.format(d));
                c.getTimezones().add(z);
            }
            listOfAllCountries.add(c);
        }
        return listOfAllCountries;
    }
}
