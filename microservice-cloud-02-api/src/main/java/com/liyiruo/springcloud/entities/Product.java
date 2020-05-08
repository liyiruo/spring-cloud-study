package com.liyiruo.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable {
    private Long pid;
    private String productName;
    private String dbSource;
}
