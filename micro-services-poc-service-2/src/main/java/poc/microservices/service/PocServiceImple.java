package poc.microservices.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import poc.microservices.models.Message;

/**
 * <h1>PocServiceImple</h1> The PocServiceImple program implements an
 * application that simply displays "Hello World!" to the standard output.
 * <p>
 * This is independent service will return the message response
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

	/**
	 * This method set the content in message object and return the same
	 * 
	 * @return Message object will content
	 */
	@Override
	public Message getMessage() {

		log.info("Message service is invoked");
		Message message = new Message();
		message.setContent("Hello World");
		return message;

	}

}
