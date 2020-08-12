package poc.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * <h1>POC Application</h1> The PocServiceApplication program contains the main
 * method implementation and configuration.
 * <p>
 * Annotated with @SpringBootApplication @EnableCircuitBreaker 
 * @EnableHystrixDashboard & @EnableEurekaClient </P>
 *
 * @author logendran.kandasamy
 * @version 1.0
 * @since 2020-08-12
 * 
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@EnableHystrixDashboard
public class PocServiceApplication {

	/**
	 * Main method for the spring boot application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(PocServiceApplication.class, args);
	}

	/**
	 * Rest template builder with time out setting of 3000 milli seconds
	 * 
	 * @return RestTemplate
	 */
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		HttpComponentsClientHttpRequestFactory componentsClientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
		componentsClientHttpRequestFactory.setReadTimeout(3000);
		return new RestTemplate(componentsClientHttpRequestFactory);
	}
}
