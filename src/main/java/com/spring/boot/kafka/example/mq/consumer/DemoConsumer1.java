package com.spring.boot.kafka.example.mq.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class DemoConsumer1 {
	@KafkaListener(topics = {"demoTopic1"})
    public void listen(String message) {
		System.out.println(message);
	}
}
