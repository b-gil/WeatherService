package com.example.weatherapplication.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Getter
@Setter
public class SubscribeServiceModel {
    private String subscribeId;
    private boolean isSubscribeActive;
}
