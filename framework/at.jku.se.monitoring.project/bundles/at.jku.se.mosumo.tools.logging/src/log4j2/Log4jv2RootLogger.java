package log4j2;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.logging.LogFactory;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.Configuration;

import at.jku.se.mosumo.tools.logging.ILogger;
import at.jku.se.mosumo.tools.logging.ILoggerAppender;
import at.jku.se.mosumo.tools.logging.LoggerProvider;

public class Log4jv2RootLogger implements ILogger {

	private static Log4jv2RootLogger instance;

	private final Set<ILoggerAppender> appenders = new HashSet<>();
	private static Marker MARKER = MarkerManager.getMarker(LogFactory.FACTORY_DEFAULT);
	private Logger rootLogger = LogManager.getRootLogger();

	private Log4jv2RootLogger() {

	}

	/**
	 * @return The root instance of all loggers for the log4j implementation.
	 */
	public static synchronized Log4jv2RootLogger getInstance() {
		if (instance == null) {
			instance = new Log4jv2RootLogger();
		}
		return instance;
	}

	public void append(ILoggerAppender appender) {
		appenders.add(appender);

	}

	@Override
	public void debug(Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debug(Object message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Object message) {
		for (ILoggerAppender appender : appenders) {
			appender.info(message);
		}

	}

	@Override
	public void info(Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void info(Object message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Object message) {
		for (ILoggerAppender appender : appenders) {
			appender.warn(message);
		}

	}

	@Override
	public void warn(Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Object message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Object message) {
		for (ILoggerAppender appender : appenders) {
			appender.error(message);
		}

	}

	@Override
	public void error(Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void error(Object message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fatal(Object message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Object message) {
		for (ILoggerAppender appender : appenders) {
			appender.warn(message);
		}

	}

	public void removeAppender(ILoggerAppender appender) {
		appenders.remove(appender);

	}

	@Override
	public void hwInfo(Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void hwFatal(Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void missionInfo(Object message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void missionError(Object message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hwTrace(Object message) {
		// TODO Auto-generated method stub
		
	}

}
