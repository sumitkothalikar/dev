package messaging.publish;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/publish")
public class ProducerResource {

	private static final String PATH = "/error";

	@RequestMapping(value = PATH)
	public String error() {
	        return "Error handling";
	}
	@Autowired
	JmsTemplate jmsTemplate;
	
	@Autowired
	Queue queue;
	
	@GetMapping("/{message}")
	public String publish(@PathVariable("message") 
	final String message) {
		
		jmsTemplate.convertAndSend(queue, message);
		return "Successfully Published message";
	}

}