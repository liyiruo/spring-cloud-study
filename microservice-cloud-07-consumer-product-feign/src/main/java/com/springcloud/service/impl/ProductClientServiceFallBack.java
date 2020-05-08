package com.springcloud.service.impl;

import com.liyiruo.springcloud.entities.Product;
import com.springcloud.service.ProductClientService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductClientServiceFallBack implements ProductClientService {

    @Override
    public Product get(Long id) {
        return new Product(id,"id="+id+"无数据--feign&hystrix","无有效数据库");
    }

    @Override
    public List<Product> list() {
        return null;
    }

    @Override
    public boolean add(Product product) {
        return false;
    }
}
