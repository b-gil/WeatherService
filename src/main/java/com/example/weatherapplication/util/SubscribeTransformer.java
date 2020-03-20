package com.example.weatherapplication.util;

import com.example.weatherapplication.model.SubscribeDto;
import com.example.weatherapplication.model.SubscribeResponseJson;
import com.example.weatherapplication.model.SubscribeServiceModel;

public class SubscribeTransformer {

    private SubscribeTransformer() {
    }

    public static SubscribeResponseJson toJson(final SubscribeServiceModel item){
        return new SubscribeResponseJson()
                .setSubscribeActive(item.isSubscribeActive())
                .setSubscribeId(item.getSubscribeId())
                .setStartTime(item.getStartTime())
                .setLatitude(item.getLatitude())
                .setLongitude(item.getLongitude())
                .setUserId(item.getUserId());
    }

    public static SubscribeServiceModel fromDTO(final SubscribeDto item){
        return new SubscribeServiceModel()
                .setSubscribeActive(item.isSubscribeActive())
                .setSubscribeId(item.getSubscribeId())
                .setStartTime(item.getStartTime())
                .setLatitude(item.getLatitude())
                .setLongitude(item.getLongitude())
                .setUserId(item.getUserId());
    }

    public static SubscribeDto toDto(final SubscribeServiceModel item){
        return new SubscribeDto()
                .setSubscribeActive(item.isSubscribeActive())
                .setSubscribeId(item.getSubscribeId())
                .setStartTime(item.getStartTime())
                .setLatitude(item.getLatitude())
                .setLongitude(item.getLongitude())
                .setUserId(item.getUserId());
    }
}
