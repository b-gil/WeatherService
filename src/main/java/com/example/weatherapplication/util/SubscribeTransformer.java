package com.example.weatherapplication.util;

import com.example.weatherapplication.model.SubscribeDto;
import com.example.weatherapplication.model.SubscribeJson;
import com.example.weatherapplication.model.SubscribeServiceModel;

public class SubscribeTransformer {

    private SubscribeTransformer() {
    }

    public static SubscribeJson toJson(final SubscribeServiceModel item){
        return new SubscribeJson()
                .setSubscribeActive(item.isSubscribeActive())
                .setSubscribeId(item.getSubscribeId());

    }

    public static SubscribeServiceModel fromDTO(final SubscribeDto item){
        return new SubscribeServiceModel()
                .setSubscribeActive(item.isSubscribeActive())
                .setSubscribeId(item.getSubscribeId());
    }
}
