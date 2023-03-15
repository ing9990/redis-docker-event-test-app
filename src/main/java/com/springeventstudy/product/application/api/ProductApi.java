package com.springeventstudy.product.application.api;

import com.springeventstudy.product.application.api.response.ProductResponse;
import com.springeventstudy.product.domain.Product;
import com.springeventstudy.product.service.ProductService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.http.HttpStatus.OK;


@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductApi {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<ProductResponse> getProducts() {
        var data = productService.getProducts().toString();

        return ResponseEntity.status(OK).body(ProductResponse.of(data));
    }

    @PostMapping("/{productName}")
    public ResponseEntity<Void> addProduct(
            @PathVariable String productName
    ) {
        productService.addProduct(productName);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
