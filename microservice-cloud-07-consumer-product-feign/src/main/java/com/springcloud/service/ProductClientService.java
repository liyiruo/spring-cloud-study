package com.springcloud.service;

import com.liyiruo.springcloud.entities.Product;
import com.springcloud.service.impl.ProductClientServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(value = "MICROSERVICE-PRODUCT",fallback = ProductClientServiceFallBack.class)
public interface ProductClientService {
    @GetMapping(value = "/product/get/{id}")
    Product get(@PathVariable("id") Long id);

    @GetMapping("/product/list")
    List<Product> list();

    @PostMapping("/product/add")
    boolean add(Product product);
}
