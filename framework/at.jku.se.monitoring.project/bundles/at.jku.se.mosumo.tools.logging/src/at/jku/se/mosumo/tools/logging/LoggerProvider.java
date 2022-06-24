
package at.jku.se.mosumo.tools.logging;

import java.io.File;
import java.lang.management.ManagementFactory;
import java.net.URL;
import java.net.URLDecoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.appender.RollingFileAppender;
import org.apache.logging.log4j.core.config.Configuration;

import factory.LoggingFactory;
import log4j2.Log4jv2RootLogger;

/**
 * Central class to access logging functionality.
 * <p/>
 * For a canonical usage example see {@link #getLogger(Class)}.
 * 
 * 
 */
public class LoggerProvider {

	private static Set<Class<?>> createdLoggers = new HashSet<>();

	private static boolean init = false;

	private static String logFilePath;
	private static final String LOGFILE_NAME_GENERAL = "logfile";
	private static final String LOG_EXTENSION = ".txt";
	private static final boolean USE_PER_VM_LOGFILE_NAME = false;

	private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HHmmss");

	static {
		initLoggingProperties();

	}

	private static synchronized void initLoggingProperties() {
		try {
		if (!init) {
			init = true;

			// Determine full logfile names.
			final String logFileDir = getJarPath() + File.separator+"net.mv.logger"+File.separator;
		
			final String dateTime = dateFormat.format(Calendar.getInstance().getTime());
			String logfileSuffix;

			if (USE_PER_VM_LOGFILE_NAME) {
				logfileSuffix = "_" + dateTime + "_" + ManagementFactory.getRuntimeMXBean().getName() + LOG_EXTENSION;
			} else {
				String appType = System.getProperty("mv.application.type");
				logfileSuffix = (appType != null ? "_" + appType : "") + LOG_EXTENSION;
			}

			logFilePath = logFileDir + LOGFILE_NAME_GENERAL + logfileSuffix;

			System.setProperty("logfilename.general", logFilePath);

			System.out.println(" %%% Logging Path set to: " + logFileDir);

		}
		}catch(Throwable t) {
			t.printStackTrace();
		}
	}

	private static String getJarPath() {
		try {
			URL url = LoggerProvider.class.getProtectionDomain().getCodeSource().getLocation();
			String jarPath = null;
			jarPath = URLDecoder.decode(url.getFile(), "UTF-8");
			String parentPath = new File(jarPath).getParentFile().getPath();

			return parentPath;

		} catch (Exception e) {
			e.printStackTrace();
			return System.getProperty("user.home");
		}

	}

	public static synchronized ILogger getLogger(final Class<?> clazz) {
		if (clazz == null) {
			throw new IllegalArgumentException("class must not be null!");
		}
		if (createdLoggers.contains(clazz)) {
			throw new Error("A logger for '" + clazz.getName() + "' is already registered!");
		} else {
			createdLoggers.add(clazz);
			ILogger newLogger = LoggingFactory.getLogger(clazz);
			return newLogger;
		}
	}

	public static Set<File> getLogFilePaths() {
		final HashSet<File> paths = new HashSet<>();
		paths.add(new File(logFilePath));
		return paths;
	}

	public static void addAppender(ILoggerAppender appender) {
		Log4jv2RootLogger.getInstance().append(appender);

	}

	public static void removeAppender(ILoggerAppender appender) {
		Log4jv2RootLogger.getInstance().removeAppender(appender);
		
	}

	// public static void addOutputStreamAppender(Appender appender, String
	// name, Level level) {
	// LoggerContext ctx = (LoggerContext) LogManager.getContext();
	// Configuration config = ctx.getConfiguration();
	//
	// // net.mev.logging.log4j2.Log4jRootLogger lg =
	// // LoggingFactory.getRootLogger();
	// org.apache.logging.log4j.core.Logger logger = (Logger)
	// LogManager.getRootLogger();
	// logger.addAppender(appender);
	// appender.start();
	// // lg.addAppender(appender);
	//
	// ctx.updateLoggers(config);
	// // ctx.updateLoggers(config); // NECESSARY!
	// }

}
