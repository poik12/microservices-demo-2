package com.microservices.productstockservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.math.BigDecimal;

@Entity
@Table(name = "product_stocks")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductStock {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_price")
    private BigDecimal productPrice;
    @Column(name = "product_availability")
    private String productAvailability;
    @Column(name = "product_discount_offer")
    private double discountOffer;

}
