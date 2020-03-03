package com.example.weatherapplication.service;


import com.example.weatherapplication.model.WeatherServiceModel;
import java.util.List;

public interface WeatherService {
    List<WeatherServiceModel> metnisZaPogodoi(String subscribeId);
}
