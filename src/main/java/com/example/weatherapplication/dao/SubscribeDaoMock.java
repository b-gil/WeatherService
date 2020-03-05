package com.example.weatherapplication.dao;

import com.example.weatherapplication.model.SubscribeDto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SubscribeDaoMock implements SubscribeDao {
    private final List<SubscribeDto> subscribeDtoList = new ArrayList<>();

    {
        subscribeDtoList.add(new SubscribeDto().setSubscribeActive(true).setSubscribeId("1"));
        subscribeDtoList.add(new SubscribeDto().setSubscribeActive(true).setSubscribeId("2"));
        subscribeDtoList.add(new SubscribeDto().setSubscribeActive(true).setSubscribeId("3"));
        subscribeDtoList.add(new SubscribeDto().setSubscribeActive(true).setSubscribeId("4"));
    }

    @Override
    public List<SubscribeDto> findSubscribe(final String subscribeId) {
        return subscribeDtoList
                .stream()
                .filter(i -> subscribeId.equals(i.getSubscribeId()))
                .collect(Collectors.toList());
    }
}
