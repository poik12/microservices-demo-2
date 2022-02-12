package com.microservices.productenquiryservice.controller;

import com.microservices.productenquiryservice.beans.ProductEnquiryBean;
import com.microservices.productenquiryservice.client.ProductStockClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductEnquiryController {

    @Autowired
    private ProductStockClient client;

    @GetMapping("/product-enquiry/name/{name}/availability/{availability}/unit/{unit}")
    public ProductEnquiryBean getEnquiryOfProduct(@PathVariable String name,
                                                  @PathVariable String availability,
                                                  @PathVariable int unit) {

        ProductEnquiryBean productEnquiryBean = client.checkProductStockByNameAndAvailability(
                name,
                availability
        );
        double totalPrice = productEnquiryBean.getProductPrice().doubleValue() * unit;
        double discountPrice = totalPrice - (totalPrice * productEnquiryBean.getDiscountOffer()) / 100;

        return new ProductEnquiryBean(
                productEnquiryBean.getId(),
                name,
                productEnquiryBean.getProductPrice(),
                availability,
                productEnquiryBean.getDiscountOffer(),
                unit,
                discountPrice,
                productEnquiryBean.getPort()
        );
    }

}
