package com.example.weatherapplication.rest.controller;

import com.example.weatherapplication.rest.controller.model.SubscribeDeleteResponseJson;
import com.example.weatherapplication.rest.controller.model.SubscribeRequestJson;
import com.example.weatherapplication.rest.controller.model.SubscribeResponseJson;
import com.example.weatherapplication.service.SubscribeService;
import com.example.weatherapplication.util.SubscribeTransformer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.DeferredResult;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/subscribe")
public class SubscribeController {

    @Value("${socket.timeout}")
    private Long timeout;

    @Inject
    private SubscribeService subscribeService;

    @GetMapping("/show-all")
    public List<SubscribeResponseJson> showAllSubscribe() {
        return subscribeService.showAllSubscribe()
                .stream()
                .map(SubscribeTransformer::toJson)
                .collect(Collectors.toList());
    }

    @PostMapping("/create-subscribe")
    public DeferredResult<HttpStatus> createSubscribe(@RequestBody final SubscribeRequestJson request) {
        final DeferredResult<HttpStatus> result = new DeferredResult<>(timeout);
        subscribeService.createSubscribe(request);
        result.setResult(HttpStatus.OK);
        return result;
    }

    @GetMapping("/unsubscribe/{subscribe-id}")
    public DeferredResult<SubscribeDeleteResponseJson> deleteSubscribe(
            @PathVariable("subscribe-id") final String subscribeId
    ) {
        final DeferredResult<SubscribeDeleteResponseJson> result = new DeferredResult<>(timeout);
        result.setResult(subscribeService.deleteSubscribe(subscribeId));
        return result;
    }
}
