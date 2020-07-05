package com.example.weatherapplication.rest.controller.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.joda.time.DateTime;

@Accessors(chain = true)
@Getter
@Setter
public class WeatherJson {

    @JsonProperty(value = "subscribe-id")
    private String subscribeId;
    @JsonProperty(value = "data-time")
    private DateTime dateTime;
    @JsonProperty(value = "temperature")
    private int temperature;
    @JsonProperty(value = "air-humidity")
    private int airHumidity;
    @JsonProperty(value = "wind-speed")
    private int windSpeed;
    @JsonProperty(value = "wind-direction")
    private String windDirection;
    @JsonProperty(value = "cloudiness")
    private String cloudiness;
}
