package com.aedron.countryservice.services;

import com.aedron.countryservice.dto.CountryRESTAccess;
import com.aedron.countryservice.models.CountryInformation;
import com.aedron.countryservice.models.CountryNameAndCode;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class CountryService {
    public List<CountryNameAndCode> getCountryNamesAndCodes() throws IOException {
        return CountryRESTAccess.getCountryNamesAndCodes();
    }

    public CountryInformation getCountryInformation(String name) throws IOException {
        return CountryRESTAccess.getCountryInformation(name);
    }
}
