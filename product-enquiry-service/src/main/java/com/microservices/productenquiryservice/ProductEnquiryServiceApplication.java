package com.microservices.productenquiryservice;

import com.microservices.productenquiryservice.client.LoadBalancerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClients;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.microservices.productenquiryservice")
@LoadBalancerClients(defaultConfiguration = LoadBalancerConfiguration.class)
public class ProductEnquiryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductEnquiryServiceApplication.class, args);
    }
}
