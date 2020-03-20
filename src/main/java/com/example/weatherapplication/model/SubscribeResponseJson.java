package com.example.weatherapplication.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.joda.time.DateTime;

import java.math.BigDecimal;

@Accessors(chain = true)
@Getter
@Setter
public class SubscribeResponseJson {

    @JsonProperty(value = "subscribe-id")
    private String subscribeId;
    @JsonProperty(value = "is-subscribe-active")
    private boolean isSubscribeActive;
    @JsonProperty(value = "start-time")
    private DateTime startTime;
    @JsonProperty(value = "latitude")
    private BigDecimal latitude;
    @JsonProperty(value = "longitude")
    private BigDecimal longitude;
    @JsonProperty(value = "user-id")
    private String userId;

}
