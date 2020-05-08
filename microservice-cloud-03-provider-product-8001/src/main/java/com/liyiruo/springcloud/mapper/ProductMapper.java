package com.liyiruo.springcloud.mapper;

import com.liyiruo.springcloud.entities.Product;

import java.util.List;

/*
@Mapper
*/
public interface ProductMapper {

    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);
}
