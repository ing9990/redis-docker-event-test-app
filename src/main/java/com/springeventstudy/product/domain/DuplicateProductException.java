package com.springeventstudy.product.domain;

public class DuplicateProductException extends RuntimeException {

    public DuplicateProductException(String productName) {
        super(productName);
    }

}
