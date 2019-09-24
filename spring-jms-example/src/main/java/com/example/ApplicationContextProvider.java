package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextProvider implements ApplicationContextAware {

	private static final Logger LOG = LoggerFactory.getLogger(ApplicationContextProvider.class);
	private ApplicationContext context;
    
    public ApplicationContext getApplicationContext() {
    	LOG.info("ApplicationContext ={}",context);
        return context;
    }
     
    @Override
    public void setApplicationContext(ApplicationContext ac)
            throws BeansException {
    	LOG.info("Setting applicationcontext={}",ac);
        context = ac;
    }
}
