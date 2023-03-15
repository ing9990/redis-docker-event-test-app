package com.springeventstudy.product.service;


import java.util.List;

public interface RedisService {
    void set(String key, Object value);

    Object get(String key);
}
