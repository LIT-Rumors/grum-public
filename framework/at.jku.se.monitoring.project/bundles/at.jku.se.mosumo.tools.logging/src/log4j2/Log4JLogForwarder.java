/**
 * 
 */
package log4j2;

import org.apache.commons.logging.LogFactory;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

import at.jku.se.mosumo.tools.logging.ILogger;

public class Log4JLogForwarder implements ILogger {

	private final ILogger otherLogger;
	private Log4jv2RootLogger rootLogger = Log4jv2RootLogger.getInstance();
	/**
	 * 
	 * @param otherLogger
	 *          The logger to forward the logs before throwing.
	 */
	private static Marker MARKER = MarkerManager.getMarker(LogFactory.FACTORY_DEFAULT);

	public Log4JLogForwarder(final ILogger otherLogger) {
		if (otherLogger == null) {
			throw new IllegalArgumentException("otherLogger must not be null!");
		}
		if (otherLogger.getClass().equals(this.getClass())) {
			throw new IllegalArgumentException("otherLogger must be a different implmentation!");
		}
		this.otherLogger = otherLogger;
	}

	/**
	 * Logs throwable with trace level and throws it.
	 * 
	 * @param throwable
	 * @throws Throwable
	 */
	public void throwTrace(final Throwable throwable) throws Throwable {
		otherLogger.trace(throwable);
		throw throwable;
	}

	/**
	 * Logs throwable with debug level and throws it.
	 * 
	 * @param throwable
	 * @throws Throwable
	 */
	public void throwDebug(final Throwable throwable) throws Throwable {
		otherLogger.debug(throwable);
		throw throwable;
	}

	/**
	 * Logs throwable with info level and throws it.
	 * 
	 * @param throwable
	 * @throws Throwable
	 */
	public void throwInfo(final Throwable throwable) throws Throwable {
		otherLogger.info(throwable);
		throw throwable;
	}

	/**
	 * Logs throwable with warn level and throws it.
	 * 
	 * @param throwable
	 * @throws Throwable
	 */
	public void throwWarn(final Throwable throwable) throws Throwable {
		otherLogger.warn(throwable);
		throw throwable;
	}

	/**
	 * Logs throwable with error level and throws it.
	 * 
	 * @param throwable
	 * @throws Throwable
	 */
	public void throwError(final Throwable throwable) throws Throwable {
		otherLogger.error(throwable);
		throw throwable;
	}

	/**
	 * Logs throwable with fatal level and throws it.
	 * 
	 * @param throwable
	 * @throws Throwable
	 */
	public void throwFatal(final Throwable throwable) throws Throwable {
		otherLogger.fatal(throwable);
		throw throwable;
	}

	/**
	 * Logs runtimeException with trace level and throws it.
	 * 
	 * @param runtimeException
	 */
	void throwTrace(final RuntimeException runtimeException) {
		otherLogger.trace(runtimeException);
		throw runtimeException;
	}

	/**
	 * Logs runtimeException with debug level and throws it.
	 * 
	 * @param runtimeException
	 */
	void throwDebug(final RuntimeException runtimeException) {
		otherLogger.debug(runtimeException);
		throw runtimeException;
	}

	/**
	 * Logs runtimeException with info level and throws it.
	 * 
	 * @param runtimeException
	 */
	void throwInfo(final RuntimeException runtimeException) {
		otherLogger.info(runtimeException);
		throw runtimeException;
	}

	/**
	 * Logs runtimeException with warn level and throws it.
	 * 
	 * @param runtimeException
	 */
	void throwWarn(final RuntimeException runtimeException) {
		otherLogger.warn(runtimeException);
		throw runtimeException;
	}

	/**
	 * Logs runtimeException with error level and throws it.
	 * 
	 * @param runtimeException
	 */
	void throwError(final RuntimeException runtimeException) {
		otherLogger.error(runtimeException);
		throw runtimeException;
	}

	/**
	 * Logs runtimeException with fatal level and throws it.
	 * 
	 * @param runtimeException
	 */
	void throwFatal(final RuntimeException runtimeException) {
		otherLogger.fatal(runtimeException);
		throw runtimeException;
	}

	@Override
	public void debug(Object message) {
		rootLogger.debug(message);

	}

	@Override
	public void debug(Throwable throwable) {
		

	}

	@Override
	public void debug(Object message, Throwable throwable) {
		

	}

	@Override
	public void info(Object message) {
		rootLogger.info(message);

		// log(throwingSource,Level.INFO, MARKER, message, null);
	}

	@Override
	public void info(Throwable throwable) {
		rootLogger.info(throwable);

	}

	@Override
	public void info(Object message, Throwable throwable) {
		// TODO Auto-generated method stub

	}

	@Override
	public void warn(Object message) {
		rootLogger.warn(message);

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
		rootLogger.error(message);

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
	public void hwInfo(Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void hwFatal(Object message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trace(Object message) {
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
