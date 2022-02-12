package com.microservices.productstockservice.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductStockBean {

    private Long id;
    private String productName;
    private BigDecimal productPrice;
    private String productAvailability;
    private double discountOffer;

    private int port;

}
