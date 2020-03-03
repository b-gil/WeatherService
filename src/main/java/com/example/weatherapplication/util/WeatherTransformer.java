package com.example.weatherapplication.util;

import com.example.weatherapplication.model.WeatherDto;
import com.example.weatherapplication.model.WeatherJson;
import com.example.weatherapplication.model.WeatherServiceModel;

public final class WeatherTransformer {

    private WeatherTransformer() {
    }

    public static WeatherJson toJson(final WeatherServiceModel item){
        return new WeatherJson()
                .setAirHumidity(item.getAirHumidity())
                .setCloudiness(item.getCloudiness())
                .setDateTime(item.getDateTime())
                .setSubscribeId(item.getSubscribeId())
                .setTemperature(item.getTemperature())
                .setWindDirection(item.getWindDirection())
                .setWindSpeed(item.getWindSpeed());
    }

    public static WeatherServiceModel fromDTO(final WeatherDto item){
        return new WeatherServiceModel()
                .setAirHumidity(item.getAirHumidity())
                .setCloudiness(item.getCloudiness())
                .setDateTime(item.getDateTime())
                .setSubscribeId(item.getSubscribeId())
                .setTemperature(item.getTemperature())
                .setWindDirection(item.getWindDirection())
                .setWindSpeed(item.getWindSpeed());
    }
}
