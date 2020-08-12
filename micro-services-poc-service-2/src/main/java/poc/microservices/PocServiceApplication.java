package poc.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <h1>POC Application</h1> The PocServiceApplication program contains the main
 * method implementation and configuration.
 * <p>
 * Annotated with @SpringBootApplication & @EnableEurekaClient
 * </P>
 *
 * @author logendran.kandasamy
 * @version 1.0
 * @since 2020-08-12
 * 
 */
@SpringBootApplication
@EnableEurekaClient
public class PocServiceApplication {

	/**
	 * Main method for the spring boot application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(PocServiceApplication.class, args);
	}

}
