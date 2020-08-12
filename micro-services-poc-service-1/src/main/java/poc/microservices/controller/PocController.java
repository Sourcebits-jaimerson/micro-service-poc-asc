/**
 * 
 */
package poc.microservices.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import poc.microservices.models.Message;
import poc.microservices.service.PocService;

/**
 * <h1>POC controller</h1> The PocController program implements an application
 * that simply return JSON response as the standard output.
 * <p>
 * This is client facing interface and internally connected to the service classes
 * </P>
 *
 * @author logendran.kandasamy
 * @version 1.0
 * @since 2020-08-12
 * 
 */
@RestController
public class PocController {

	private static final Logger log = LoggerFactory.getLogger(PocController.class);

	@Autowired
	private PocService pocService;

	/**
	 * This method mapped to an end point "/get-message".
	 * 
	 * @return ResponseEntity<Message>
	 * 
	 */
	@GetMapping("/get-message")
	public ResponseEntity<Message> getMessage() {
		log.info("-- get message api invoked --");
		return pocService.getMessage();
	}
	
	/**
	 * This method mapped to an end point "/get-default-message".
	 * 
	 * @return ResponseEntity<Message>
	 * 
	 */
	@GetMapping("/get-default-message")
	public ResponseEntity<Message> getDefaultMessage() {
		log.info("-- get default message api invoked --");
		return pocService.getDefaultMessage();
	}

}
