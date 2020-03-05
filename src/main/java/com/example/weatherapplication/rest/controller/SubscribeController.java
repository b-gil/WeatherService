package com.example.weatherapplication.rest.controller;

import com.example.weatherapplication.model.SubscribeJson;
import com.example.weatherapplication.service.SubscribeService;
import com.example.weatherapplication.util.SubscribeTransformer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SubscribeController {

    @Inject
    private SubscribeService subscribeService;

    @GetMapping("/subscribe/{subscribe-id}")
    public List<SubscribeJson> getSubscribe(
            @PathVariable("subscribe-id") String subscribeId
    ) {
        return subscribeService.metnisZaSubscribom(subscribeId)
                .stream()
                .map(SubscribeTransformer::toJson)
                .collect(Collectors.toList());
    }
}
