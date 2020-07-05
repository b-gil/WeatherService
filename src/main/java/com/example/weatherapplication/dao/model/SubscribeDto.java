package com.example.weatherapplication.dao.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.joda.time.DateTime;

import java.math.BigDecimal;

@Accessors(chain = true)
@Getter
@Setter
public class SubscribeDto {

    private String subscribeId;
    private boolean isSubscribeActive;
    private DateTime startTime;
    private String userId;
    private BigDecimal latitude;
    private BigDecimal longitude;

}
