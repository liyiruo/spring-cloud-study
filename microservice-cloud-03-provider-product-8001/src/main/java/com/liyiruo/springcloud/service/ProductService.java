package com.liyiruo.springcloud.service;

import com.liyiruo.springcloud.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {

    boolean add(Product product);

    Product get(Long id);

    List<Product> list();
}
