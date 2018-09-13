package ch.jamas.hello.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloSpring {

	final static Logger logger = LoggerFactory.getLogger(HelloSpring.class);

	private String message;

	public void setMessage(String message) {
		logger.info("setMessage({})", message);
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Spring says: " + message);
	}

}
