package com.springeventstudy.product.application.api.response;

import lombok.*;


@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Builder
public class ProductResponse {
    private String productName;

    public static ProductResponse of(String productName) {
        return new ProductResponse(productName);
    }
}
