package com.example.weatherapplication.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Getter
@Setter
public class SubscribeJson {

    @JsonProperty(value = "subscribe-id")
    private String subscribeId;
    @JsonProperty(value = "is-subscribe-active")
    private boolean isSubscribeActive;
}
