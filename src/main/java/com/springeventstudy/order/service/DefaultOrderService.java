package com.springeventstudy.order.service;

import com.springeventstudy.order.infra.event.OrderedEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class DefaultOrderService implements OrderService {

    private final ApplicationEventPublisher publisher;

    public void order(String productName) {
        log.info("상품 주문 로직 실행");

        publisher.publishEvent(new OrderedEvent(this, productName));
    }
}