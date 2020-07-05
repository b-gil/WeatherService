package com.example.weatherapplication.dao;

import com.example.weatherapplication.dao.model.WeatherDto;
import org.joda.time.DateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class WeatherDaoMock implements WeatherDao {

    private final List<WeatherDto> weatherDtoList = new ArrayList<>();

    {
        weatherDtoList.add(new WeatherDto().setTemperature(-7)
                .setAirHumidity(77)
                .setDateTime(DateTime.now())
                .setCloudiness("Ясно")
                .setWindDirection("Северный")
                .setSubscribeId("1")
                .setWindSpeed(5));
        weatherDtoList.add(new WeatherDto().setTemperature(-6)
                .setAirHumidity(76)
                .setDateTime(DateTime.now())
                .setCloudiness("Облачно")
                .setWindDirection("Северный")
                .setSubscribeId("1")
                .setWindSpeed(6));
        weatherDtoList.add(new WeatherDto().setTemperature(-5)
                .setAirHumidity(75)
                .setDateTime(DateTime.now())
                .setCloudiness("Пасмурно")
                .setWindDirection("Северный")
                .setSubscribeId("1")
                .setWindSpeed(7));
        weatherDtoList.add(new WeatherDto().setTemperature(-4)
                .setAirHumidity(74)
                .setDateTime(DateTime.now())
                .setCloudiness("Ясно")
                .setWindDirection("Северный")
                .setSubscribeId("4").setWindSpeed(5));
        weatherDtoList.add(new WeatherDto().setTemperature(-3)
                .setAirHumidity(73)
                .setDateTime(DateTime.now())
                .setCloudiness("Облачно")
                .setWindDirection("Северный")
                .setSubscribeId("5").setWindSpeed(5));
    }

    @Override
    public List<WeatherDto> findWeather(final String subscribeId) {
        return weatherDtoList
                .stream()
                .filter(i -> subscribeId.equals(i.getSubscribeId()))
                .collect(Collectors.toList());
    }
}
