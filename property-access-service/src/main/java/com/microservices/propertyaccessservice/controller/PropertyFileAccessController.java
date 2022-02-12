package com.microservices.propertyaccessservice.controller;

import com.microservices.propertyaccessservice.beans.PropertyAccessBean;
import com.microservices.propertyaccessservice.beans.PropertyAccessValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/access")
public class PropertyFileAccessController {

    @Autowired
    private PropertyAccessBean propertyAccessBean;

    @GetMapping("/property-file")
    public PropertyAccessValue accessPropertyFile() {
        refreshActuator();
        return new PropertyAccessValue(
                propertyAccessBean.getName(),
                propertyAccessBean.getDescription()
        );
    }

    private void refreshActuator() {
        RestTemplate restTemplate = new RestTemplate();
        final String baseUrl = "http://localhost:8100/actuator/refresh";

        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        HttpEntity entity = new HttpEntity<>(headers);

        ResponseEntity<String> result = restTemplate.postForEntity(
                baseUrl,
                entity,
                String.class
        );

    }

}
