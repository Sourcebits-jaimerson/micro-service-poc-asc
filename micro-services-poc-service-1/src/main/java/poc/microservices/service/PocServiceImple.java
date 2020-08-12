package poc.microservices.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import poc.microservices.models.Message;

/**
 * <h1>PocServiceImple</h1> The PocServiceImple program implements an
 * application that simply displays "Hello World!" to the standard output.
 * <p>
 * This is client facing interface and internally connected to other micro
 * service.
 * </P>
 *
 * @author logendran.kandasamy
 * @version 1.0
 * @since 2020-08-12
 * 
 */
@Service
public class PocServiceImple implements PocService {

	private static final Logger log = LoggerFactory.getLogger(PocServiceImple.class);

	@Autowired
	RestTemplate restTemplate;

	/**
	 * This method will get the message from the MESSAGE-API service
	 * 
	 * @return ResponseEntity<Message>
	 * 
	 */
	@Override
	public ResponseEntity<Message> getMessage() {

		Message message = restTemplate.getForObject("http://message-api/message", Message.class);
		log.info("Message set and returning the API response");
		return new ResponseEntity<Message>(message, HttpStatus.OK);

	}

	/**
	 * This method will create a known exception and deviate to the fall back method
	 * for default response. Fall back method : getFallBackDefaultMessage()
	 * 
	 * @return ResponseEntity<Message>
	 * 
	 */
	@Override
	@HystrixCommand(fallbackMethod = "getFallBackDefaultMessage")
	public ResponseEntity<Message> getDefaultMessage() {

		// There is no end point available "default-message-api".
		// creating known failure to invoke the fall back method.
		log.info("getDefaultMessage invoked");
		Message message = restTemplate.getForObject("http://default-message-api/message", Message.class);
		return new ResponseEntity<Message>(message, HttpStatus.OK);

	}

	/**
	 * This is the fall back method and returns a preset response.
	 * 
	 * @return ResponseEntity<Message>
	 * 
	 */
	public ResponseEntity<Message> getFallBackDefaultMessage() {

		log.info("Response from fall back method");
		Message message = new Message();
		message.setContent("Message from fall back response");
		return new ResponseEntity<Message>(message, HttpStatus.OK);

	}

}
