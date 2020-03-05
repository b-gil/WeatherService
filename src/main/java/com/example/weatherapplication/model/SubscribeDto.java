package com.example.weatherapplication.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Getter
@Setter
public class SubscribeDto {

    private String subscribeId;
    private boolean isSubscribeActive;

}
