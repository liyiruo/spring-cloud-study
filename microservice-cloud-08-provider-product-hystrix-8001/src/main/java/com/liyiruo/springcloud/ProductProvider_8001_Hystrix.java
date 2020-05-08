package com.liyiruo.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.liyiruo.springcloud.mapper")
public class ProductProvider_8001_Hystrix {
    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_8001_Hystrix.class, args);
    }
}
