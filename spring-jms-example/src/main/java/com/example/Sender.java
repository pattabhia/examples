package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Sender {

  private static final Logger LOG = LoggerFactory.getLogger(Sender.class);

  public void send(String destination, String message) {
	  LOG.info("sending message='{}' to destination='{}'", message, destination);
    //jmsTemplate.convertAndSend(destination, message);
  }
  
}
