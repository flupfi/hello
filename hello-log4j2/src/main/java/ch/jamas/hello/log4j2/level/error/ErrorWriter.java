package ch.jamas.hello.log4j2.level.error;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ErrorWriter {

	private static final Logger LOG = LogManager.getLogger(ErrorWriter.class);

	public static void main(String[] args) {
		LOG.trace("TRACE");
		LOG.debug("DEBUG");
		LOG.info("INFO");
		LOG.warn("WARN");
		LOG.error("ERROR");
		LOG.fatal("FATAL");
	}

	public void writeLog() {
		LOG.trace("TRACE");
		LOG.debug("DEBUG");
		LOG.info("INFO");
		LOG.warn("WARN");
		LOG.error("ERROR");
		LOG.fatal("FATAL");
	}

}
