package com.example.weatherapplication.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.joda.time.DateTime;


@Accessors(chain = true)
@Getter
@Setter
public class WeatherDto {

    private String subscribeId;
    private DateTime dateTime;
    private int temperature;
    private int airHumidity;
    private int windSpeed;
    private String windDirection;
    private String cloudiness;

}
