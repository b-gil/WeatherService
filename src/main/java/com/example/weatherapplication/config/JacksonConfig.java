package com.example.weatherapplication.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import lombok.val;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.text.SimpleDateFormat;

@Configuration
public class JacksonConfig {

    @Bean
    public ObjectMapper objectMapper() {
        val mapper = new ObjectMapper();
        mapper.registerModule(new JodaModule());
        mapper.setDateFormat(SimpleDateFormat.getDateTimeInstance());
        return mapper;
    }
}
