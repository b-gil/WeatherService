package com.example.weatherapplication.service;

import com.example.weatherapplication.model.SubscribeDeleteResponseJson;
import com.example.weatherapplication.model.SubscribeRequestJson;
import com.example.weatherapplication.model.SubscribeServiceModel;
import java.util.List;

public interface SubscribeService {

    List<SubscribeServiceModel> showAllSubscribe();

    void createSubscribe(SubscribeRequestJson requestJson);

    SubscribeDeleteResponseJson deleteSubscribe(String subscribeId);
}
