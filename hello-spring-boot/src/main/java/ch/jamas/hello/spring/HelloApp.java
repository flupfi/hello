package ch.jamas.hello.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {

	final static Logger logger = LoggerFactory.getLogger(HelloApp.class);
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("helloAppContext.xml");
		logger.info("Context loaded.");
		
		HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");
		logger.info("Bean \"helloBean\" loaded.");
		helloSpring.getMessage();
	}

}
