package com.example.weatherapplication.service;

import com.example.weatherapplication.dao.SubscribeDao;
import com.example.weatherapplication.dao.WeatherDao;
import com.example.weatherapplication.model.open.weather.api.OpenWeatherApiResponse;
import com.example.weatherapplication.model.SubscribeDto;
import com.example.weatherapplication.model.WeatherServiceModel;
import com.example.weatherapplication.util.WeatherTransformer;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.springframework.beans.factory.annotation.Value;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Objects.nonNull;

@Slf4j
public class WeatherServiceImpl implements WeatherService {

    private static final int CNT_OF_STATION = 1;

    @Inject
    private WeatherDao weatherDAO;

    @Inject
    private HttpClient httpClient;

    @Inject
    private SubscribeDao subscribeDao;

    @Value("${weather.api.key}")
    private String apiKey;

    @Inject
    private ObjectMapper objectMapper;


    @Override
    public List<WeatherServiceModel> findWeatherFromDB(final String subscribeId) {
        return weatherDAO.findWeather(subscribeId)
                .stream()
                .map(WeatherTransformer::fromDTO)
                .collect(Collectors.toList());
    }

    @Override
    public WeatherServiceModel retrieveWeatherFromSubscribe(final String subscribeId) {
        final SubscribeDto subscribeDto = subscribeDao.findSubscribe(subscribeId).orElse(null);
        if (nonNull(subscribeDto)) {
            try {
                val url = "http://api.openweathermap.org/data/2.5/weather?lat="
                        + subscribeDto.getLatitude().toString()
                        + "&lon=" + subscribeDto.getLongitude().toString()
                        + "&appid=" + apiKey;
                final HttpGet getRequest = new HttpGet(url);
                getRequest.addHeader("accept", "application/json");

                final HttpResponse response = httpClient.execute(getRequest);

                val mapper = objectMapper.readValue(response.getEntity().getContent(), OpenWeatherApiResponse.class);



                log.info("Weather: {}",  mapper);
                final WeatherServiceModel weather = new WeatherServiceModel();
                return weather;
            } catch (Exception e) {
                log.error("Fault on metnutsa naruzu za pogodoi", e);
                return null;
            }
        }
        return null;
    }
}
