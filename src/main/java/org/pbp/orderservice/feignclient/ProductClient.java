package org.pbp.orderservice.feignclient;

import org.pbp.orderservice.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service", url = "${service.url.product}")
public interface ProductClient {

    @GetMapping("/api/products/{productId}")
    ProductDto getProductById(@PathVariable Long productId);
}
