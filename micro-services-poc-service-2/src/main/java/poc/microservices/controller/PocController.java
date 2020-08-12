/**
 * 
 */
package poc.microservices.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
	 * This method mapped to an end point "/message".
	 * 
	 * @return ResponseEntity<Message>
	 * 
	 */
	@GetMapping("/message")
	public Message getMessage(){
		log.info("-- get message api invoked --");
		return pocService.getMessage();
	}

}
