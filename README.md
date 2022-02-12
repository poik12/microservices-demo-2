# Microservices Demo App Second Version

---------------------------------------

Java Version: 17 LTS
---------------------------------------

Spring Boot Version: 2.5.7
---------------------------------------

Type of architecture in microservices:
---------------------------------------

---------------------------------------

Port Configuration
---------------------------------------

|No.|Components | Ports |
|---|------------|-------|
|1.|Spring Cloud Config Server|8888|
|2.|Eureka Naming and Discovery Server|8761 |
|3.|Zuul API Gateway|8762	|
|4.|Spring API Gateway|8763|
|5.|Zipkin Distributed Tracing|	9411|

|No.|Microservices | Ports |
|---|------------|-------|
|1.|property-access-service| 8100 |
|2.|product-stock-service|	8200, 8201, 8202 |
|3.|product-enquiry-service| 8300, 8301, 8302 |

---------------------------------------

Dependencies
---------------------------------------
- Lombok
- Spring Boot Starter Test
- Spring Web
- Spring Cloud Config
- Spring Bootstrap
- Spring Actuator
    