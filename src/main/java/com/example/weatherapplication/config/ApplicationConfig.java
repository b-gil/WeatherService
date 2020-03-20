/*
 * Copyright 2020 Russian Post
 *
 * This source code is Russian Post Confidential Proprietary.
 * This software is protected by copyright. All rights and titles are reserved.
 * You shall not use, copy, distribute, modify, decompile, disassemble or reverse engineer the software.
 * Otherwise this violation would be treated by law and would be subject to legal prosecution.
 * Legal use of the software provides receipt of a license from the right holder only.
 */
package com.example.weatherapplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * ApplicationConfig class
 *
 * @author <a href="mailto:ikaragusov@luxoft.com">Ivan V.Karagusov</a>
 */
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
