# Microservices Demo App Second Version

---------------------------------------

Java Version: 17 LTS
---------------------------------------

Spring Boot Version: 2.5.7
---------------------------------------

Accessories
---------------------------------------
- docker version: 20.10.12
- docker-compose version: 1.29.2

Type of architecture in microservices:
---------------------------------------

---------------------------------------

Port Configuration
---------------------------------------

|No.|Components | Ports |
|--|------------|-------|
|1.|Spring Cloud Config Server| 8888 |
|2.|Eureka Naming and Discovery Server| 8761 |
|3.|Zuul API Gateway| 8762	|
|4.|Spring API Gateway| 8763 |
|5.|Zipkin Distributed Tracing| 9411 |
|6.|RabbitMQ| 15672 |
|7.|Prometheus| 9090 |
|8.|Grafana| 3000 |

|No.|Microservices | Ports |
|---|------------|-------|
|1.|property-access-service| 8100 |
|2.|product-stock-service|	8200, 8201, 8202 |
|3.|product-enquiry-service| 8300, 8301, 8302 |

---------------------------------------

Dependencies
---------------------------------------
1. Developer Tools
   - Lombok
2. WEB
   - Spring Web
3. SQL
   - H2 Database
   - Spring Data JPA
4. OPS
   - Spring Actuator
5. Spring Cloud Config
   - Spring Cloud Config
6. Spring Cloud Discovery
   - Eureka Discovery Client
   - Eureka Server
7. Spring Cloud Routing
   - OpenFeign
   - Cloud LoadBalancer
   - Ribbon LoadBalancer
   - Gateway
   - Zuul API Gateway
8. Observability
   - Sleuth
   - Zipkin Client
   - Prometheus
   - Grafana
9. Messaging
   - Spring for RabbitMQ
