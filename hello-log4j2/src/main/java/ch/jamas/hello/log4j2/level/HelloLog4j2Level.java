package ch.jamas.hello.log4j2.level;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ch.jamas.hello.log4j2.level.error.ErrorWriter;
import ch.jamas.hello.log4j2.level.fatal.FatalWriter;
import ch.jamas.hello.log4j2.level.info.InfoWriter;
import ch.jamas.hello.log4j2.level.debug.DebugWriter;
import ch.jamas.hello.log4j2.level.trace.TraceWriter;
import ch.jamas.hello.log4j2.level.warn.WarnWriter;

public class HelloLog4j2Level {
	
	private static final Logger LOG = LogManager.getLogger(HelloLog4j2Level.class);
	
	
	public static void main(String[] a) throws Exception {
		LOG.trace("Hello Log4j2 TRACE.");
		LOG.debug("Hello Log4j2 DEBUG.");
		LOG.info("Hello Log4j2 INFO.");
		LOG.warn("Hello Log4j2 WARN.");
		LOG.error("Hello Log4j2 ERROR.");
		LOG.fatal("Hello Log4j2 FATAL.");
		
		HelloLog4j2Level helloLog4j2Level = new HelloLog4j2Level();
		try {
			helloLog4j2Level.testException();
		} catch (Exception e) {
			LOG.error("Error {} {}",5, "---", e);
		}
		
		helloLog4j2Level.testLogLevel();
		
		helloLog4j2Level.writeLog();
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
		LOG.fatal("FATAL");
	}
	
	public void writeLog() {
		TraceWriter traceWriter = new TraceWriter();
		traceWriter.writeLog();
		DebugWriter debugWriter = new DebugWriter();
		debugWriter.writeLog();
		InfoWriter infoWriter = new InfoWriter();
		infoWriter.writeLog();
		WarnWriter warnWriter = new WarnWriter();
		warnWriter.writeLog();
		ErrorWriter errorWriter = new ErrorWriter();
		errorWriter.writeLog();
		FatalWriter fatalWriter = new FatalWriter();
		fatalWriter.writeLog();
	}
}