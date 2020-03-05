package com.example.weatherapplication.config;

import com.example.weatherapplication.service.SubscribeService;
import com.example.weatherapplication.service.SubscribeServiceImpl;
import com.example.weatherapplication.service.WeatherService;
import com.example.weatherapplication.service.WeatherServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class ServiceConfig {

    @Bean
    @Lazy
    public WeatherService weatherService(){
        return new WeatherServiceImpl();
    }

    @Bean
    @Lazy
    public SubscribeService subscribeService(){
        return new SubscribeServiceImpl();
    }
}
