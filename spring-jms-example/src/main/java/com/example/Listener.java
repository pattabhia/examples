package com.example;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.QueueBrowser;
import javax.jms.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.BrowserCallback;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Listener {

	private static final Logger LOG = LoggerFactory.getLogger(Listener.class);

	@Autowired
	private JmsTemplate jmsTemplate1;
	
	//@JmsListener(destination = "inbound.queue")
	//@SendTo("outbound.queue")
	public int receiveMessageCount() throws JMSException {
		int messageCount = getFirstQueueMessageCount();
		/*String response = null;
		if (jsonMessage instanceof TextMessage) {
			TextMessage textMessage = (TextMessage) jsonMessage;
			messageData = textMessage.getText();
			Map map = new Gson().fromJson(messageData, Map.class);
			response = "Hello " + map.get("name");
		}*/
		return messageCount;
	}

	private int getFirstQueueMessageCount() {
		int messageCount = (int) jmsTemplate1.browse("inbound.queue", new BrowserCallback<Integer>() {
			@Override
			public Integer doInJms(Session s, QueueBrowser qb) throws JMSException {
				int cnt = 0;
				while(qb.getEnumeration().hasMoreElements()) {
					qb.getEnumeration().nextElement();
					cnt++;
				}
				return cnt;
			}
		});
		return messageCount;
	}

}