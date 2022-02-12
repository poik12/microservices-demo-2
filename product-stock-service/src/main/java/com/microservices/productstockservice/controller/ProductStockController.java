package com.microservices.productstockservice.controller;

import com.microservices.productstockservice.beans.ProductStockBean;
import com.microservices.productstockservice.entity.ProductStock;
import com.microservices.productstockservice.repository.ProductStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
public class ProductStockController {

    @Autowired
    private Environment environment;

    @Autowired
    private ProductStockRepository productStockRepository;

    @GetMapping("/check-product-stock")
    public List<ProductStockBean> checkProductStockAll() {
        return productStockRepository.findAll()
                .stream()
                .map(productStock -> new ProductStockBean(
                                productStock.getId(),
                                productStock.getProductName(),
                                productStock.getProductPrice(),
                                productStock.getProductAvailability(),
                                productStock.getDiscountOffer(),
                                Integer.parseInt(Objects.requireNonNull(environment.getProperty("local.server.port")))
                        )
                ).collect(Collectors.toList());
    }

    @GetMapping("/check-product-stock/name/{productName}/availability/{productAvailability}")
    public ProductStockBean checkProductStockByNameAndAvailability(@PathVariable("productName") String productName,
                                                                   @PathVariable("productAvailability") String productAvailability) {
        ProductStock productStock = productStockRepository.findByProductNameAndProductAvailability(
                productName,
                productAvailability
        );

        return new ProductStockBean(
                productStock.getId(),
                productStock.getProductName(),
                productStock.getProductPrice(),
                productStock.getProductAvailability(),
                productStock.getDiscountOffer(),
                Integer.parseInt(Objects.requireNonNull(environment.getProperty("local.server.port")))
        );
    }

}
