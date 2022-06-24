package at.jku.se.mosumo.monitoring.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtil {

	public static final Pattern ATTRIBUTE_PATTERN = Pattern.compile("\\/.*");
	public static final Pattern INSTANCE_PATTERN = Pattern.compile("^[^\\/]+(?=\\/)");
	public static final Pattern TOPIC_TAIL_PATTERN = Pattern.compile("[^\\/]*$");

	public static String getSingle(Pattern pattern, String input) throws MatchingException {
		Matcher matcher = pattern.matcher(input);
		while (matcher.find()) {
			String match = matcher.group();
			return match;
		}
		throw new MatchingException("Pattern can not be applied!");
	}

}
