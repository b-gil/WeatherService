package com.example.weatherapplication.service;

import com.example.weatherapplication.dao.SubscribeDao;
import com.example.weatherapplication.model.SubscribeDeleteResponseJson;
import com.example.weatherapplication.model.SubscribeRequestJson;
import com.example.weatherapplication.model.SubscribeServiceModel;
import com.example.weatherapplication.util.SubscribeTransformer;
import lombok.val;
import org.joda.time.DateTime;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import static com.example.weatherapplication.util.SubscribeTransformer.toDto;
import static java.util.Objects.nonNull;

public class SubscribeServiceImpl implements SubscribeService {

    @Inject
    private SubscribeDao subscribeDao;

    @Override
    public List<SubscribeServiceModel> showAllSubscribe() {
        return subscribeDao.showAllSubscribe()
                .stream()
                .map(SubscribeTransformer::fromDTO)
                .collect(Collectors.toList());
    }

    @Override
    public void createSubscribe(final SubscribeRequestJson requestJson) {
        val serviceModel = new SubscribeServiceModel()
                .setSubscribeId(UUID.randomUUID().toString())
                .setSubscribeActive(true)
                .setStartTime(DateTime.now())
                .setUserId(requestJson.getUserId())
                .setLatitude(requestJson.getLatitude())
                .setLongitude(requestJson.getLongitude());

        subscribeDao.createSubscribe(toDto(serviceModel));
    }

    @Override
    public SubscribeDeleteResponseJson deleteSubscribe(final String subscribeId) {
        val subscribe = subscribeDao.findSubscribe(subscribeId).orElse(null);
        val response = new SubscribeDeleteResponseJson();
        if (nonNull(subscribe)) {
            subscribeDao.deleteSubscribe(subscribeId);
            return response.setSuccess(true);
        } else {
            return response.setSuccess(false).setMessage("ti pidor");
        }
    }
}
