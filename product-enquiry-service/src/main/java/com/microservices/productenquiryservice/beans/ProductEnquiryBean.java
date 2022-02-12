package com.microservices.productenquiryservice.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductEnquiryBean {

    private Long id;
    private String productName;
    private BigDecimal productPrice;
    private String productAvailability;
    private double discountOffer;

    private int unit;
    private double totalPrice;

    private int port;

}
