package com.example.weatherapplication.service;

import com.example.weatherapplication.rest.controller.model.SubscribeDeleteResponseJson;
import com.example.weatherapplication.rest.controller.model.SubscribeRequestJson;
import com.example.weatherapplication.service.model.SubscribeServiceModel;
import java.util.List;

public interface SubscribeService {

    List<SubscribeServiceModel> showAllSubscribe();

    void createSubscribe(SubscribeRequestJson requestJson);

    SubscribeDeleteResponseJson deleteSubscribe(String subscribeId);
}
