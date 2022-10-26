package com.aedron.countryservice.models;

public class CountryInformation {
    private String name;
    private String code;
    private String capital;
    private Integer population;
    private String flagURL;

    public CountryInformation(String name, String code, String capital, Integer population, String flagURL) {
        this.name = name;
        this.code = code;
        this.capital = capital;
        this.population = population;
        this.flagURL = flagURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public String getFlagURL() {
        return flagURL;
    }

    public void setFlagURL(String flagURL) {
        this.flagURL = flagURL;
    }
}
