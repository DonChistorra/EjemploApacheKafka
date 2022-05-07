package com.chisto.kafka.example;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

	@KafkaListener(topics = "chisto", groupId = "any")
	void listener(String data){
		System.out.println("Recibido :" + data);
	}
}
