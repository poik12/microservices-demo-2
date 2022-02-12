package com.microservices.productstockservice;

import com.microservices.productstockservice.entity.ProductStock;
import com.microservices.productstockservice.repository.ProductStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.math.BigDecimal;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductStockServiceApplication implements CommandLineRunner {

    @Autowired
    private ProductStockRepository productStockRepository;

    public static void main(String[] args) {
        SpringApplication.run(ProductStockServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        productStockRepository.save(new ProductStock(1L, "Ball", BigDecimal.valueOf(20), "yes", 5));
        productStockRepository.save(new ProductStock(2L, "Helmet", BigDecimal.valueOf(50), "yes", 20));
        productStockRepository.save(new ProductStock(3L, "Trousers", BigDecimal.valueOf(30), "no", 8));
        productStockRepository.save(new ProductStock(4L, "Shoes", BigDecimal.valueOf(50), "yes", 6));
        productStockRepository.save(new ProductStock(5L, "T-shirt", BigDecimal.valueOf(100), "no", 10));
    }
}
