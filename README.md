# Microservices Demo App Second Version

Type of architecture:
---------------------------------------

Port Configuration
---------------------------------------

|Components | Ports |
|------------|-------|
|Spring Cloud Config Server|8888|
|Eureka Naming and Discovery Server|8761 |
|Zuul API Gateway|8762	|
|Spring API Gateway|8763|
|Zipkin Distributed Tracing|	9411|

|MIcroservices | Ports |
|------------|-------|
|property-access-service|	8100 |
|product-stock-service|	8200, 8201, 8202 |
|product-enquiery-service| 8300, 8301, 8302 |
