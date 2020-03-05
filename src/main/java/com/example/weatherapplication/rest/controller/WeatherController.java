package com.example.weatherapplication.rest.controller;

import com.example.weatherapplication.model.WeatherJson;
import com.example.weatherapplication.service.WeatherService;
import com.example.weatherapplication.util.WeatherTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class WeatherController {

    @Inject
    private WeatherService weatherService;


    @GetMapping("/weather/{subscribe-id}")
    public List<WeatherJson> getWeather(
            @PathVariable("subscribe-id") String subscribeId
    ) {
        return weatherService.metnisZaPogodoi(subscribeId)
                .stream()
                .map(WeatherTransformer::toJson)
                .collect(Collectors.toList());

    }
}
