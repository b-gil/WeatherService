package com.example.weatherapplication.service;

import com.example.weatherapplication.service.model.WeatherServiceModel;
import java.util.List;

public interface WeatherService {

    List<WeatherServiceModel> findWeatherFromDB(String subscribeId);

    WeatherServiceModel retrieveWeatherFromSubscribe(String subscribeId);

}
