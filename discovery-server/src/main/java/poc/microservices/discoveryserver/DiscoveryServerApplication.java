package poc.microservices.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <h1>DiscoveryServerApplication</h1> The is Eureka server to discover and
 * maintain all the micro service registered with Eureka client.
 * <p>
 * Annotated with @SpringBootApplication & @EnableEurekaServer
 * </P>
 *
 * @author logendran.kandasamy
 * @version 1.0
 * @since 2020-08-12
 * 
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerApplication {

	/**
	 * Main method for the spring boot application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServerApplication.class, args);
	}

}
