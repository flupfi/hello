package ch.jamas.hello.log4j2.level.trace;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TraceWriter {

	private static final Logger LOG = LogManager.getLogger(TraceWriter.class);

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
