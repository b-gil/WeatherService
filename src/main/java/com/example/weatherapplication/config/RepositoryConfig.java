package com.example.weatherapplication.config;

import com.example.weatherapplication.dao.WeatherDao;
import com.example.weatherapplication.dao.WeatherDaoMock;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class RepositoryConfig {

    @Bean
    @Lazy
    public WeatherDao weatherDao(){
        return new WeatherDaoMock();
    }
}
