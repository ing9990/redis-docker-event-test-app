package com.springeventstudy.order.infra.event.listenser;

import com.springeventstudy.order.infra.event.OrderedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class OrderedEventListener implements ApplicationListener<OrderedEvent> {

    @Override
    public void onApplicationEvent(OrderedEvent event) {
        log.info("timestamp:{}, product:{}", event.getTimestamp(), event.getProductName());
    }

    @EventListener
    public void sendPush(OrderedEvent event) {
        log.info(String.format("푸시 메세지 발송 [상품명 : %s]", event.getProductName()));
    }

    @EventListener
    public void sendMail(OrderedEvent event) {
        log.info(String.format("메일 전송 [상품명 : %s]", event.getProductName()));
    }
}