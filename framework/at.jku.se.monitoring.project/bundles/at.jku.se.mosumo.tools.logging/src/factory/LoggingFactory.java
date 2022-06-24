package factory;

import at.jku.se.mosumo.tools.logging.ILogger;
import log4j2.Log4Jv2Logger;

public class LoggingFactory {
	
	public static ILogger getLogger(Class<?> clazz) {
		return new Log4Jv2Logger(clazz);
	}
}
