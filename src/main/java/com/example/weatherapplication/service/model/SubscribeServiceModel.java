package com.example.weatherapplication.service.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.joda.time.DateTime;

import java.math.BigDecimal;

@Accessors(chain = true)
@Getter
@Setter
public class SubscribeServiceModel {
    private String subscribeId;
    private boolean isSubscribeActive;
    private DateTime startTime;
    private String userId;
    private BigDecimal latitude;
    private BigDecimal longitude;
}
