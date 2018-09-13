package ch.jamas.hello.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloSLF4J {
	
	private static final Logger LOG = LoggerFactory.getLogger(HelloSLF4J.class);
	
	
	public static void main(String[] a) throws Exception {
		LOG.info("Hello SLF4J.");
		LOG.error("Hello SLF4J.");
		
		HelloSLF4J helloSLF4J = new HelloSLF4J();
		try {
			helloSLF4J.testException();
		} catch (Exception e) {
			LOG.error("Error {} {}",5, "---", e);
		}
		
		helloSLF4J.testLogLevel();
	}
	
	public void testException() throws Exception {
		throw new RuntimeException("Test");
	}
	
	public void testLogLevel() {
		LOG.trace("TRACE");
		LOG.debug("DEBUG");
		LOG.info("INFO");
		LOG.warn("WARN");
		LOG.error("ERROR");
	}
}