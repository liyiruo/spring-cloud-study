package com.springcloud.controller;


import com.liyiruo.springcloud.entities.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@Slf4j
public class ProductController_Consumer {
//    private static final String REST_URL_PREFIX = "http://localhost:8001";
    private static final String REST_URL_PREFIX = "http://MICROSERVICE-PRODUCT";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/product/add")
    public boolean add(Product product) {
        log.info("product==>{}",product);
        String url = REST_URL_PREFIX + "/product/add";
        log.info("add.url=>{}", url);
        return restTemplate.postForObject(REST_URL_PREFIX + "/product/add", product, Boolean.class);
    }

    @RequestMapping(value = "consumer/product/get/{id}")
    public Product get(@PathVariable("id") Long id) {
        log.info("id==>{}",id);
        String url = REST_URL_PREFIX + "/product/get/" + id;
        log.info("get.url=>{}",url);
        return restTemplate.getForObject(url, Product.class);
    }

    @RequestMapping("/consumer/product/list")
    public List<Product> list() {
        String url = REST_URL_PREFIX + "/product/list";
        log.info("list.url=>{}",url);
        return restTemplate.getForObject(REST_URL_PREFIX + "/product/list", List.class);
    }


}
