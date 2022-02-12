package com.microservices.propertyaccessservice.beans;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "property-file")
public class PropertyAccessBean {

    private String name;
    private String description;

}
