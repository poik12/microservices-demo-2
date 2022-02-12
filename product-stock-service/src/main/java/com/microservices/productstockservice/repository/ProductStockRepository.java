package com.microservices.productstockservice.repository;

import com.microservices.productstockservice.entity.ProductStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductStockRepository extends JpaRepository<ProductStock, Long> {

    // using raw query
//    @Query("FROM ProductStock WHERE productName = :productName AND productAvailability = :productAvailability")
//    ProductStock findByProductNameAndProductAvailability(@Param("productName") String productName,
//                                                         @Param("productAvailability") String productAvailability);

    // using hql
    ProductStock findByProductNameAndProductAvailability(String productName, String productAvailability);


}
