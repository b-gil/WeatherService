package com.example.weatherapplication.util;

import com.example.weatherapplication.dao.model.WeatherDto;
import com.example.weatherapplication.model.open.weather.api.OpenWeatherApiResponse;
import com.example.weatherapplication.rest.controller.model.WeatherJson;
import com.example.weatherapplication.service.model.WeatherServiceModel;
import lombok.val;
import org.joda.time.DateTime;
import static java.util.Objects.isNull;

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

    public static WeatherServiceModel fromJson(final OpenWeatherApiResponse item){
        val result = new WeatherServiceModel();
        result.setDateTime(DateTime.now());

        int temperature = item.getMain().getTemp().intValue();
        result.setTemperature(temperature);

        int humidity = item.getMain().getHumidity();
        result.setAirHumidity(humidity);

        int windSpeed = item.getWind().getSpeed().intValue();
        result.setWindSpeed(windSpeed);

        val windDirection = isNull(item.getWind().getDeg()) ? null : item.getWind().getDeg().toString();
        result.setWindDirection(windDirection);

        val cloundiness = isNull(item.getClouds().getAll()) ? null : item.getClouds().getAll().toString();
        result.setCloudiness(cloundiness);

        return result;
    }
}
