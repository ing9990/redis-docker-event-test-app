package com.springeventstudy.product.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ElectronicsProductService implements ProductService {

    private final RedisService redisService;

    @Override
    public void addProduct(String productName) {
        log.info("This is electronics products: " + productName);

        redisService.set("products", productName);
    }

    @Override
    public Object getProducts() {
        return redisService.get("products");
    }
}
