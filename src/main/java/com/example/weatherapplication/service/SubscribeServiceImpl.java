package com.example.weatherapplication.service;

import com.example.weatherapplication.dao.SubscribeDao;
import com.example.weatherapplication.model.SubscribeServiceModel;
import com.example.weatherapplication.util.SubscribeTransformer;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

public class SubscribeServiceImpl implements SubscribeService {

    @Inject
    private SubscribeDao subscribeDao;

    @Override
    public List<SubscribeServiceModel> metnisZaSubscribom(final String subscribeId) {
        return subscribeDao.findSubscribe(subscribeId)
                .stream()
                .map(SubscribeTransformer::fromDTO)
                .collect(Collectors.toList());

    }
}
