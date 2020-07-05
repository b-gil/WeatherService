package com.example.weatherapplication.dao;

import com.example.weatherapplication.dao.model.SubscribeDto;
import java.util.List;
import java.util.Optional;

public interface SubscribeDao {

    Optional<SubscribeDto> findSubscribe(String subscribeId);

    List<SubscribeDto> showAllSubscribe();

    void createSubscribe(SubscribeDto subscribeDto);

    void deleteSubscribe(String subscribeId);
}
