package com.springeventstudy.order.application.api;

import com.springeventstudy.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders/{productName}")
@RequiredArgsConstructor
public class OrderApi {

    private final OrderService orderService;

    // 상품을 주문한다.
    @PostMapping
    public ResponseEntity<Void> orderProduct(
            @PathVariable String productName
    ) {
        orderService.order(productName);

        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
