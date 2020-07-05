package com.example.weatherapplication.rest.controller.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(chain = true)
public class SubscribeDeleteResponseJson {

    private boolean success;
    private String message;

}
