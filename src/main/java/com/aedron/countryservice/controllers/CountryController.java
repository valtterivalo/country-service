package com.aedron.countryservice.controllers;

import com.aedron.countryservice.models.CountryInformation;
import com.aedron.countryservice.models.CountryNameAndCode;
import com.aedron.countryservice.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
public class CountryController {

    private final CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @RequestMapping(path = "/countries")
    public Map<String, List<CountryNameAndCode>> getCountryNamesAndCodes() throws IOException {
        return Map.of("countries", countryService.getCountryNamesAndCodes());
    }

    @RequestMapping(path = "/countries/{name}")
    public CountryInformation getCountryInformation(@PathVariable String name) throws IOException {
        return countryService.getCountryInformation(name);
    }
}
