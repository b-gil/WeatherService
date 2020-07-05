package com.example.weatherapplication.config;

import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestClientWeatherConfig {

    @Bean
    public HttpClient httpClient() {
        return HttpClientBuilder.create().build();
    }
}
