package com.liyiruo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard //开启服务监控
public class HystrixDashhoard_9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashhoard_9001.class, args);
    }
}
