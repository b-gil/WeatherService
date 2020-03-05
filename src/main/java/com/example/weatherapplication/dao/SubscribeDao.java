package com.example.weatherapplication.dao;

import com.example.weatherapplication.model.SubscribeDto;
import java.util.List;

public interface SubscribeDao {
    List<SubscribeDto> findSubscribe(String subscribeId);
}
