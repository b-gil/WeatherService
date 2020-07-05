package com.example.weatherapplication.dao;

import com.example.weatherapplication.dao.model.SubscribeDto;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SubscribeDaoMock implements SubscribeDao {
    private final List<SubscribeDto> subscribeDtoList = new ArrayList<>();

    {
        subscribeDtoList.add(new SubscribeDto()
                .setSubscribeActive(true)
                .setLatitude(new BigDecimal(55.985736))
                .setLongitude(new BigDecimal(73.31302))
                .setStartTime(DateTime.now())
                .setSubscribeId("1"));

        subscribeDtoList.add(new SubscribeDto()
                .setSubscribeActive(true)
                .setLatitude(new BigDecimal(55.985736))
                .setLongitude(new BigDecimal(74.31302))
                .setStartTime(DateTime.now())
                .setSubscribeId("2"));

        subscribeDtoList.add(new SubscribeDto()
                .setSubscribeActive(true)
                .setLatitude(new BigDecimal(66.985736))
                .setLongitude(new BigDecimal(74.31302))
                .setStartTime(DateTime.now())
                .setSubscribeId("3"));

        subscribeDtoList.add(new SubscribeDto()
                .setSubscribeActive(true)
                .setLatitude(new BigDecimal(99.985736))
                .setLongitude(new BigDecimal(99.31302))
                .setStartTime(DateTime.now())
                .setSubscribeId("4"));

        subscribeDtoList.add(new SubscribeDto()
                .setSubscribeActive(true)
                .setLatitude(new BigDecimal(54.985736))
                .setLongitude(new BigDecimal(73.31302))
                .setStartTime(DateTime.now())
                .setSubscribeId("1488"));
    }

    @Override
    public Optional<SubscribeDto> findSubscribe(final String subscribeId) {
        return subscribeDtoList
                .stream()
                .filter(i -> subscribeId.equals(i.getSubscribeId()))
                .findFirst();
    }

    @Override
    public List<SubscribeDto> showAllSubscribe() {
        return subscribeDtoList;
    }

    @Override
    public void createSubscribe(final SubscribeDto subscribeDto) {
        subscribeDtoList.add(subscribeDto);
    }

    @Override
    public void deleteSubscribe(final String subscribeId) {
        subscribeDtoList.remove(
                subscribeDtoList.stream()
                        .filter(i -> subscribeId.equals(i.getSubscribeId()))
                        .findFirst()
                        .orElse(null)
        );
    }
}
