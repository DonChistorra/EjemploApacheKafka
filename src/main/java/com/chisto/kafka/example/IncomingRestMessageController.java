package com.chisto.kafka.example;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/messages")
public class IncomingRestMessageController {

	private KafkaTemplate<String, String> kafkaTemplate;
	
	public IncomingRestMessageController(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}

	@PostMapping
	public void publishToKafka(@RequestBody MessageRequest request) {
		kafkaTemplate.send("chisto", "Api message received: " + request.getMensaje());
	}
	
}
