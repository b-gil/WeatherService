package com.example.weatherapplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@Import({
    JacksonConfig.class,
    RepositoryConfig.class,
    RestClientWeatherConfig.class,
    ServiceConfig.class
})
@PropertySources({
    @PropertySource("classpath:/application.properties"),
    @PropertySource("classpath:/credential.properties")
})
public class ApplicationConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
