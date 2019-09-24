package com.example;

import javax.jms.JMSException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
@EnableJms
public class SpringJmsApplication {

	private static final Logger LOG = LoggerFactory.getLogger("SpringBootMain");
	
	@Autowired
	private Listener listener;

	public static void main(String[] args) throws JMSException {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJmsApplication.class, args);
		JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);
		/*for (int i = 0; i < 40000; i++) {
			final int index = i;
			jmsTemplate.convertAndSend("inbound.queue", "Hello world!" + index);
		}*/
		SpringJmsApplication app = context.getBean(SpringJmsApplication.class);
		app.getPendingMessageCount();
	}
	
	public void getPendingMessageCount() throws JMSException {
		int messageCount = listener.receiveMessageCount();
		LOG.info("Queue Message Count = {}", messageCount);
	}
}