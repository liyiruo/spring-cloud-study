package com.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    /*@LoadBalanced表示这个RestTemplate开启负载均衡，在调用服务提供者的接口时
    * 可服务使用名称代替真实IP地址。服务名称就是服务提供者在application.yml中
    * 配置的Spring.application.name属性的值*/
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
