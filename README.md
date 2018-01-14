# Spring Cloud Netflix Example

Spring Cloud Netflix stack example with 3 microservices.
Develop with Spring Boot 2.

## Prerequisites

* Maven
* Rabbit MQ (for Spring cloud Bus)
* GIT repository (for distributed configuration in limits-service)

## Architecture projects

* [Eureka naming server](https://github.com/ojoDev/spring-cloud-netflix/tree/master/netflix-eureka-naming-server)
* Ribbon load balancer (only maven dependencies)
* [Zuul proxy](https://github.com/ojoDev/spring-cloud-netflix/tree/master/netflix-zuul-api-gateway-server)
* [Spring cloud config server](https://github.com/ojoDev/spring-cloud-netflix/tree/master/spring-cloud-config-server)
* [Zipkin distribucin traces](https://github.com/ojoDev/spring-cloud-netflix/tree/master/zipkin-distributed-tracing-server)

## Microservices projects

* [Currency conversion service](https://github.com/ojoDev/spring-cloud-netflix/tree/master/currency-conversion-service) (calls currency-exhange-service)
* [Currency exchange service](https://github.com/ojoDev/spring-cloud-netflix/tree/master/currency-exchange-service)
* [Limits-service](https://github.com/ojoDev/spring-cloud-netflix/tree/master/limits-service)
