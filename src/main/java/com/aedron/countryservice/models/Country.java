package com.aedron.countryservice.models;

import java.util.List;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "tld",
        "cca2",
        "ccn3",
        "cca3",
        "cioc",
        "independent",
        "status",
        "unMember",
        "currencies",
        "idd",
        "capital",
        "altSpellings",
        "region",
        "subregion",
        "languages",
        "translations",
        "latlng",
        "landlocked",
        "borders",
        "area",
        "demonyms",
        "flag",
        "maps",
        "population",
        "gini",
        "fifa",
        "car",
        "timezones",
        "continents",
        "flags",
        "coatOfArms",
        "startOfWeek",
        "capitalInfo",
        "postalCode"
})
@Generated("jsonschema2pojo")
public class Country {

    @JsonProperty("name")
    private Name name;
    @JsonProperty("tld")
    private List<String> tld = null;
    @JsonProperty("cca2")
    private String cca2;
    @JsonProperty("ccn3")
    private String ccn3;
    @JsonProperty("cca3")
    private String cca3;
    @JsonProperty("cioc")
    private String cioc;
    @JsonProperty("independent")
    private Boolean independent;
    @JsonProperty("status")
    private String status;
    @JsonProperty("unMember")
    private Boolean unMember;
    @JsonProperty("capital")
    private List<String> capital = null;
    @JsonProperty("altSpellings")
    private List<String> altSpellings = null;
    @JsonProperty("region")
    private String region;
    @JsonProperty("subregion")
    private String subregion;
    @JsonProperty("latlng")
    private List<Integer> latlng = null;
    @JsonProperty("landlocked")
    private Boolean landlocked;
    @JsonProperty("borders")
    private List<String> borders = null;
    @JsonProperty("area")
    private Integer area;
    @JsonProperty("flag")
    private String flag;
    @JsonProperty("population")
    private Integer population;
    @JsonProperty("fifa")
    private String fifa;
    @JsonProperty("timezones")
    private List<String> timezones = null;
    @JsonProperty("continents")
    private List<String> continents = null;
    @JsonProperty("flags")
    private Flags flags;
    @JsonProperty("startOfWeek")
    private String startOfWeek;

    @JsonProperty("name")
    public Name getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(Name name) {
        this.name = name;
    }

    @JsonProperty("tld")
    public List<String> getTld() {
        return tld;
    }

    @JsonProperty("tld")
    public void setTld(List<String> tld) {
        this.tld = tld;
    }

    @JsonProperty("cca2")
    public String getCca2() {
        return cca2;
    }

    @JsonProperty("cca2")
    public void setCca2(String cca2) {
        this.cca2 = cca2;
    }

    @JsonProperty("ccn3")
    public String getCcn3() {
        return ccn3;
    }

    @JsonProperty("ccn3")
    public void setCcn3(String ccn3) {
        this.ccn3 = ccn3;
    }

    @JsonProperty("cca3")
    public String getCca3() {
        return cca3;
    }

    @JsonProperty("cca3")
    public void setCca3(String cca3) {
        this.cca3 = cca3;
    }

    @JsonProperty("cioc")
    public String getCioc() {
        return cioc;
    }

    @JsonProperty("cioc")
    public void setCioc(String cioc) {
        this.cioc = cioc;
    }

    @JsonProperty("independent")
    public Boolean getIndependent() {
        return independent;
    }

    @JsonProperty("independent")
    public void setIndependent(Boolean independent) {
        this.independent = independent;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("unMember")
    public Boolean getUnMember() {
        return unMember;
    }

    @JsonProperty("unMember")
    public void setUnMember(Boolean unMember) {
        this.unMember = unMember;
    }

    @JsonProperty("capital")
    public List<String> getCapital() {
        return capital;
    }

    @JsonProperty("capital")
    public void setCapital(List<String> capital) {
        this.capital = capital;
    }

    @JsonProperty("altSpellings")
    public List<String> getAltSpellings() {
        return altSpellings;
    }

    @JsonProperty("altSpellings")
    public void setAltSpellings(List<String> altSpellings) {
        this.altSpellings = altSpellings;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    @JsonProperty("subregion")
    public String getSubregion() {
        return subregion;
    }

    @JsonProperty("subregion")
    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    @JsonProperty("latlng")
    public List<Integer> getLatlng() {
        return latlng;
    }

    @JsonProperty("latlng")
    public void setLatlng(List<Integer> latlng) {
        this.latlng = latlng;
    }

    @JsonProperty("landlocked")
    public Boolean getLandlocked() {
        return landlocked;
    }

    @JsonProperty("landlocked")
    public void setLandlocked(Boolean landlocked) {
        this.landlocked = landlocked;
    }

    @JsonProperty("borders")
    public List<String> getBorders() {
        return borders;
    }

    @JsonProperty("borders")
    public void setBorders(List<String> borders) {
        this.borders = borders;
    }

    @JsonProperty("area")
    public Integer getArea() {
        return area;
    }

    @JsonProperty("area")
    public void setArea(Integer area) {
        this.area = area;
    }

    @JsonProperty("flag")
    public String getFlag() {
        return flag;
    }

    @JsonProperty("flag")
    public void setFlag(String flag) {
        this.flag = flag;
    }

    @JsonProperty("population")
    public Integer getPopulation() {
        return population;
    }

    @JsonProperty("population")
    public void setPopulation(Integer population) {
        this.population = population;
    }

    @JsonProperty("fifa")
    public String getFifa() {
        return fifa;
    }

    @JsonProperty("fifa")
    public void setFifa(String fifa) {
        this.fifa = fifa;
    }

    @JsonProperty("timezones")
    public List<String> getTimezones() {
        return timezones;
    }

    @JsonProperty("timezones")
    public void setTimezones(List<String> timezones) {
        this.timezones = timezones;
    }

    @JsonProperty("continents")
    public List<String> getContinents() {
        return continents;
    }

    @JsonProperty("continents")
    public void setContinents(List<String> continents) {
        this.continents = continents;
    }

    @JsonProperty("flags")
    public Flags getFlags() {
        return flags;
    }

    @JsonProperty("flags")
    public void setFlags(Flags flags) {
        this.flags = flags;
    }

    @JsonProperty("startOfWeek")
    public String getStartOfWeek() {
        return startOfWeek;
    }

    @JsonProperty("startOfWeek")
    public void setStartOfWeek(String startOfWeek) {
        this.startOfWeek = startOfWeek;
    }

}