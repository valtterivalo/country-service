package com.aedron.countryservice.models;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "png",
        "svg"
})
@Generated("jsonschema2pojo")
public class Flags {

    @JsonProperty("png")
    private String png;
    @JsonProperty("svg")
    private String svg;

    @JsonProperty("png")
    public String getPng() {
        return png;
    }

    @JsonProperty("png")
    public void setPng(String png) {
        this.png = png;
    }

    @JsonProperty("svg")
    public String getSvg() {
        return svg;
    }

    @JsonProperty("svg")
    public void setSvg(String svg) {
        this.svg = svg;
    }

}