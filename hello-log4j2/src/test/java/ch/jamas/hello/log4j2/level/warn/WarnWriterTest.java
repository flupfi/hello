package ch.jamas.hello.log4j2.level.warn;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class WarnWriterTest {
	private static final Logger LOG = LogManager.getLogger(WarnWriterTest.class);

	public static void main(String[] args) {
		LOG.trace("TRACE");
		LOG.debug("DEBUG");
		LOG.info("INFO");
		LOG.warn("WARN");
		LOG.error("ERROR");
		LOG.fatal("FATAL");
	}
	
	@Test
	public void testLog4jWarn() {
		LOG.trace("TRACE");
		LOG.debug("DEBUG");
		LOG.info("INFO");
		LOG.warn("WARN");
		LOG.error("ERROR");
		LOG.fatal("FATAL");
	}

}
