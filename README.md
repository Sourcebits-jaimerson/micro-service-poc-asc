# micro-service-poc-asc
Code with micro service POC


# discovery-server
Eureka server implementaion using spring boot and netflix eureka server liberaries. 
* Build commmand    -  mvn spring-boot:run
* End point URL     - <Host_url>:8761

# micro-services-poc-service-1
REST API implemented using spring boot and considered as independent miro service 1. It contains client facing end points. 
* Build commmand    -  mvn spring-boot:run
* End point URL 1   - <Host_url>:8081/get-message
* End point URL 1   - <Host_url>:8081/get-default-message
  
# micro-services-poc-service-2
REST API implemented using spring boot and considered as independent miro service 1. It contains internal service end point.
* Build commmand    -  mvn spring-boot:run
* End point URL     - <Host_url>:8082/message


## Hystrix details
Hystrix used to implement the circuit breaker mechanism. Hystrix dashboard is configure for monitoring purpose.
* URL             - <Host_url>:8081/hystrix
* Monitorying URL - <Host_url>:8081/actuator/hystrix.stream
