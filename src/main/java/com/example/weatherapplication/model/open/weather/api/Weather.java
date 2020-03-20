package com.example.weatherapplication.model.open.weather.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {

    private Integer id;
    private String main;
    private String description;
    private String icon;
}
