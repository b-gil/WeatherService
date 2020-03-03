package com.example.weatherapplication.dao;

import com.example.weatherapplication.model.WeatherDto;

import java.util.List;

public interface WeatherDao {
    List<WeatherDto> findWeather(String subscribeId);
}
