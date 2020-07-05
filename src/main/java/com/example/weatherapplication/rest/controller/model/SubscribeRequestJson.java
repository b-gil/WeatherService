package com.example.weatherapplication.rest.controller.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import java.math.BigDecimal;

@Getter
@Setter
@Accessors(chain = true)
public class SubscribeRequestJson {
    @JsonProperty(value = "latitude")
    private BigDecimal latitude;
    @JsonProperty(value = "longitude")
    private BigDecimal longitude;
    @JsonProperty(value = "user-id")
    private String userId;
}
