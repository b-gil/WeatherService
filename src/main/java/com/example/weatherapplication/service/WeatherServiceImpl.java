package com.example.weatherapplication.service;

import com.example.weatherapplication.dao.WeatherDao;
import com.example.weatherapplication.model.WeatherServiceModel;
import com.example.weatherapplication.util.WeatherTransformer;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

public class WeatherServiceImpl implements WeatherService{

    @Inject
    private WeatherDao weatherDAO;



    @Override
    public List<WeatherServiceModel> metnisZaPogodoi(final String subscribeId) {
        return weatherDAO.findWeather(subscribeId)
                .stream()
                .map(WeatherTransformer::fromDTO)
                .collect(Collectors.toList());
    }
}
