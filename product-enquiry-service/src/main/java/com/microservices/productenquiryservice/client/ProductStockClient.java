package com.microservices.productenquiryservice.client;

import com.microservices.productenquiryservice.beans.ProductEnquiryBean;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "product-stock-service", url = "http://localhost:8200/") // without load balancer it requires url
@FeignClient(name = "product-stock-service") // with load balancer Ribbon
//@RibbonClient(name = "product-stock-service")
@LoadBalancerClient(name = "product-stock-service")
public interface ProductStockClient {

    @GetMapping("/check-product-stock/name/{productName}/availability/{productAvailability}")
    ProductEnquiryBean checkProductStockByNameAndAvailability(@PathVariable("productName") String productName,
                                                              @PathVariable("productAvailability") String productAvailability);

}
