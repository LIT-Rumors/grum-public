package at.jku.se.mosumo.tools.logging;

/**
 * @author Michael Vierhauser
 * 
 */
public interface ILogger {

	void debug(final Object message);

	void debug(final Throwable throwable);

	void debug(final Object message, final Throwable throwable);

	void info(final Object message);

	void info(final Throwable throwable);

	void info(final Object message, final Throwable throwable);

	void warn(final Object message);

	void warn(final Throwable throwable);

	void warn(final Object message, final Throwable throwable);

	void error(final Object message);

	void error(final Throwable throwable);

	void error(final Object message, final Throwable throwable);

	void fatal(final Object message);

	void fatal(final Throwable throwable);

	void fatal(final Object message, final Throwable throwable);

	void trace(Throwable throwable);

	void trace(Object message);

	void hwTrace(Object message);

	void hwInfo(Object message); 

	void hwFatal(Object message);

	void missionInfo(Object message);

	void missionError(Object message);

}
