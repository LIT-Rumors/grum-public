package log4j2;

import org.apache.commons.logging.LogFactory;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import org.apache.logging.log4j.message.StringFormatterMessageFactory;
import org.apache.logging.log4j.spi.ExtendedLogger;
import org.apache.logging.log4j.spi.ExtendedLoggerWrapper;

import at.jku.se.mosumo.tools.logging.ILogger;

public class Log4Jv2Logger implements ILogger {

	private static String NEWLINE = System.getProperty("line.separator");
	private static final String ERROR_SEPARATOR = "-----------------------------------------------------------------------";
	private static String ERROR_SUFFIX = NEWLINE + ERROR_SEPARATOR;
	private final transient ExtendedLogger log;
	private final transient String throwingSource;
	private org.apache.logging.log4j.Logger logger;
	private Log4JLogForwarder throwAdapter;
	private static Marker MARKER = MarkerManager.getMarker(LogFactory.FACTORY_DEFAULT);
	private static Marker MARKER_MISSION = MarkerManager.getMarker("MISSION");
	private static Marker MARKER_HW = MarkerManager.getMarker("HW");
	private static Marker MARKER_HWTRACE = MarkerManager.getMarker("HW_TRACE");
	
	
	final Level HW_INFO = Level.forName("HW_INFO", 60);
	final Level HW_TRACE = Level.forName("HW_TRACE", 650);
	final Level HW_FATAL = Level.forName("HW_FATAL", 30);
	
	final Level MISSION_INFO = Level.forName("MISSION_INFO", 80);
	final Level MISSION_ERROR = Level.forName("MISSION_ERROR", 70);

	public Log4Jv2Logger(final Class<?> clazz) {
		this(clazz.getName(), clazz);
		throwAdapter = new Log4JLogForwarder(this);
	}

	public Log4Jv2Logger(final String throwingSource, final Class<?> clazz) {
		logger = org.apache.logging.log4j.LogManager.getLogger(clazz);
		this.throwingSource = Log4Jv2Logger.class.getName();
		log = new ExtendedLoggerWrapper((ExtendedLogger) logger, throwingSource, StringFormatterMessageFactory.INSTANCE);

	}

	@Override
	public void debug(final Object message) {
		log.logIfEnabled(throwingSource, Level.DEBUG, MARKER, message, null);
		//log.debug(throwingSource, Level.DEBUG, String.valueOf(message), null);
		throwAdapter.debug(message);
	}

	@Override
	public void debug(Throwable throwable) {
		debug("", throwable);
	}

	@Override
	public void debug(final Object message, final Throwable throwable) {
		log.logIfEnabled(throwingSource, Level.DEBUG, MARKER, message, throwable);
		//log.debug(throwingSource, Level.DEBUG, String.valueOf(message), throwable);
		throwAdapter.debug(message, throwable);
	}

	@Override
	public void info(final Object message) {
		log.logIfEnabled(throwingSource, Level.INFO, MARKER, message, null);
		throwAdapter.info(message);
	}

	@Override
	public void info(Throwable throwable) {
		info("", throwable);
	}

	@Override
	public void info(final Object message, final Throwable throwable) {
		log.logIfEnabled(throwingSource, Level.INFO, MARKER, message, throwable);
		throwAdapter.info(message, throwable);
	}

	@Override
	public void warn(final Object message) {
		log.logIfEnabled(throwingSource, Level.WARN, MARKER, message, null);
		throwAdapter.warn(message);
	}

	@Override
	public void warn(Throwable throwable) {
		warn("", throwable);
	}

	@Override
	public void warn(final Object message, final Throwable throwable) {
		log.logIfEnabled(throwingSource, Level.WARN, MARKER, message, throwable);
		throwAdapter.warn(message, throwable);
	}

	@Override
	public void error(final Object message) {
		Object logMessage = message.toString() + ERROR_SUFFIX;
		log.logIfEnabled(throwingSource, Level.ERROR, MARKER, logMessage, null);
		throwAdapter.error(message);
	}

	@Override
	public void error(final Throwable throwable) {
		error(throwable.getMessage(), throwable);
	}

	@Override
	public void error(final Object message, final Throwable throwable) {
		log.logIfEnabled(throwingSource, Level.ERROR, MARKER, String.valueOf(message), throwable);
		throwAdapter.error(message, throwable);
	}

	@Override
	public void fatal(final Object message) {
		Object logMessage = message.toString() + ERROR_SUFFIX;
		log.logIfEnabled(throwingSource, Level.FATAL, MARKER, logMessage, null);
		throwAdapter.fatal(message);
	}

	@Override
	public void fatal(Throwable throwable) {
		fatal("", throwable);
	}

	@Override
	public void fatal(final Object message, final Throwable throwable) {
		// the throwable output is visible enough to highlight an error
		log.logIfEnabled(throwingSource, Level.FATAL, MARKER, String.valueOf(message), throwable);
		throwAdapter.fatal(throwable);
	}
	
	
	@Override
	public void hwTrace(final Object message) {
		Object logMessage = message.toString();
		log.logIfEnabled(throwingSource, HW_TRACE, MARKER_HWTRACE, logMessage, null);
		// throwAdapter.fatal(message);
	}

	@Override
	public void hwInfo(final Object message) {
		Object logMessage = message.toString();
		log.logIfEnabled(throwingSource, HW_INFO, MARKER_HW, logMessage, null);
		// throwAdapter.fatal(message);
	}

	@Override
	public void hwFatal(final Object message) {
		Object logMessage = message.toString();
		log.logIfEnabled(throwingSource, HW_FATAL, MARKER_HW, logMessage, null);
		// throwAdapter.fatal(message);
	}
	
	@Override
	public void missionInfo(final Object message) {
		Object logMessage = message.toString();
		log.logIfEnabled(throwingSource, MISSION_INFO, MARKER_MISSION, logMessage, null);
		// throwAdapter.fatal(message);
	}
	
	@Override
	public void missionError(final Object message) {
		Object logMessage = message.toString();
		log.logIfEnabled(throwingSource, MISSION_ERROR, MARKER_MISSION, logMessage, null);
		// throwAdapter.fatal(message);
	}

	public void throwTrace(Throwable throwable) throws Throwable {
		throwAdapter.throwTrace(throwable);
	}

	public void throwDebug(Throwable throwable) throws Throwable {
		throwAdapter.throwDebug(throwable);
	}

	public void throwInfo(Throwable throwable) throws Throwable {
		throwAdapter.throwInfo(throwable);
	}

	public void throwWarn(Throwable throwable) throws Throwable {
		throwAdapter.throwWarn(throwable);
	}

	public void throwError(Throwable throwable) throws Throwable {
		throwAdapter.throwError(throwable);
	}

	public void throwFatal(Throwable throwable) throws Throwable {
		throwAdapter.throwFatal(throwable);
	}

	public void throwTrace(RuntimeException runtimeException) {
		throwAdapter.throwTrace(runtimeException);
	}

	public void throwDebug(RuntimeException runtimeException) {
		throwAdapter.throwDebug(runtimeException);
	}

	public void throwInfo(RuntimeException runtimeException) {
		throwAdapter.throwInfo(runtimeException);
	}

	public void throwWarn(RuntimeException runtimeException) {
		throwAdapter.throwWarn(runtimeException);
	}

	public void throwError(RuntimeException runtimeException) {
		throwAdapter.throwError(runtimeException);
	}

	public void throwFatal(RuntimeException runtimeException) {
		throwAdapter.throwFatal(runtimeException);
	}

	@Override
	public void trace(Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(final Object message) {
		log.logIfEnabled(throwingSource, Level.TRACE, MARKER, message, null);
		throwAdapter.warn(message);
	}

}
