package com.springcloud.controller;


import com.liyiruo.springcloud.entities.Product;
import com.springcloud.service.ProductClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@Slf4j
public class ProductController_Feign {
    @Autowired
    private ProductClientService service;
    @RequestMapping(value = "/consumer/product/add")
    public boolean add(Product product) {
        return service.add(product);
    }
    @RequestMapping(value = "consumer/product/get/{id}")
    public Product get(@PathVariable("id") Long id) {
        return service.get(id);
    }
    @RequestMapping("/consumer/product/list")
    public List<Product> list() {
        return service.list();
    }
}
