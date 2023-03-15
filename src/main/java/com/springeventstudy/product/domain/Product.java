package com.springeventstudy.product.domain;

import lombok.*;
import org.springframework.util.StringUtils;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "product_name", unique = true, nullable = false)
    private String productName;

    @Column(name = "product_create_at", updatable = false)
    private LocalDateTime createAt;

    public static Product buildProduct(String productName) {
        if (!StringUtils.hasText(productName)) {
            throw new IllegalArgumentException("상품명은 필수 값입니다.");
        }

        return Product.builder()
                .productName(productName)
                .createAt(LocalDateTime.now())
                .build();
    }

    public void updateProductName(String productName) {
        if (!StringUtils.hasText(productName)) {
            throw new IllegalArgumentException("상품명은 필수 값입니다.");
        }

        this.productName = productName;
    }
}








