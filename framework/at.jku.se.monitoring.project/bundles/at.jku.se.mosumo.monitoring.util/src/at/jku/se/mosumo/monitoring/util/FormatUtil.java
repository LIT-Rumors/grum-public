package at.jku.se.mosumo.monitoring.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class FormatUtil {
	

	public static final String FORMAT_YEAR_FIRST = "yyyy-MM-dd HH:mm:ss";
	public static final String FORMAT_YEAR_FIRST_MILLIS = "yyyy-MM-dd HH:mm:ss.SSS";
	public static final String FORMAT_FILE = "yyyy_MM_dd_HH_mm_ss";
	public static final String FORMAT_HOUR_FIRST_MILLIS = "HH:mm:ss.SSS";

	// public static final String FORMAT_YEAR_FIRST = "yyyy-MM-dd HH:mm:ss";
	public static final String FORMAT_DATE_STD = "E M yy";

	public static String formatTimestamp(long timestamp) {
		return formatTimestamp(timestamp, FORMAT_YEAR_FIRST);
	}

	public static String formatTimeElapsed(long l) {
		final long hr = TimeUnit.MILLISECONDS.toHours(l);
		final long min = TimeUnit.MILLISECONDS.toMinutes(l - TimeUnit.HOURS.toMillis(hr));
		final long sec = TimeUnit.MILLISECONDS.toSeconds(l - TimeUnit.HOURS.toMillis(hr) - TimeUnit.MINUTES.toMillis(min));
		return String.format("%02d:%02d:%02d", hr, min, sec);
	}

	public static String formatTimestamp(long timestamp, String format) {
		DateFormat formatter = new SimpleDateFormat(format);
		Calendar c = new GregorianCalendar();
		c.setTimeInMillis(timestamp);
		return formatter.format(c.getTime());
	}

	

	public static long unformatTimestamp(String timestamp, String type) {
		DateFormat formatter = new SimpleDateFormat(type);
		Date date;
		long dateInLong = -1;
		try {
			date = formatter.parse(timestamp);
			dateInLong = date.getTime();
			return dateInLong;
		} catch (ParseException ex) {
			ex.printStackTrace();
		}
		return -1;
	}

	public static boolean canParse(String timestamp, String type) {
		DateFormat formatter = new SimpleDateFormat(type);
		try {
			formatter.parse(timestamp);
			return true;
		} catch (ParseException ex) {
			return false;
		}
	}

}
