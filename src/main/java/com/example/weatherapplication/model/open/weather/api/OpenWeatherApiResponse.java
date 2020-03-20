package com.example.weatherapplication.model.open.weather.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenWeatherApiResponse {

    private Coord coord;
    private List<Weather> weather;
    private String base;
    private WeatherMain main;
    private Wind wind;
    private Clouds clouds;
}
