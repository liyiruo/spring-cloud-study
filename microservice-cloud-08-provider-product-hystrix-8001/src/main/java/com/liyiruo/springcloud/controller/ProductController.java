package com.liyiruo.springcloud.controller;

import com.liyiruo.springcloud.entities.Product;
import com.liyiruo.springcloud.service.ProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/product/add")
    public boolean add(@RequestBody Product product) {
        return productService.add(product);
    }

    @HystrixCommand(fallbackMethod = "getFallback")
    @GetMapping("/product/get/{id}")
    public Product get(@PathVariable("id") Long id) {
        Product product = productService.get(id);
        if (product == null) {
            throw new RuntimeException("id=" + id + "无效");
        }
        return product;
    }

    @GetMapping("/product/list")
    public List<Product> list() {
        return productService.list();
    }


    public Product getFallback(@PathVariable("id") Long id) {
        return new Product(id, "ID=" + id + "无效--@HystrixCommand", "无有效数据库");
    }

}
