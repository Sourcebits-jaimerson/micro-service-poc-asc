/**
 * 
 */
package poc.microservices.service;

import org.springframework.http.ResponseEntity;

import poc.microservices.models.Message;

/**
 * <h1>Hello, World!</h1> The PocService interface will define the methods that
 * simply displays "Hello World!" to the standard output. 
 *
 * @author logendran.kandasamy
 * @version 1.0
 * @since 2020-08-12
 * 
 */
public interface PocService {

	ResponseEntity<Message> getMessage();
	
	ResponseEntity<Message> getDefaultMessage();
}
