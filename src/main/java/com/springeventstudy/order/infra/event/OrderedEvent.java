package com.springeventstudy.order.infra.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class OrderedEvent extends ApplicationEvent {

    private String productName;

    public OrderedEvent(Object source, String productName) {
        super(source);
        this.productName = productName;
    }
}