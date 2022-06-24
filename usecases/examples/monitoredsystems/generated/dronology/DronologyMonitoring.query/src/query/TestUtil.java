package query;

public class TestUtil {

	public static boolean test(Double lat, Double lon, Double alt) {
		return (alt <= 50 && alt >= 5) && (lat <= 41.8 && lat >= 41.4) && (lon <= -86.0 && lon >= -87.0);
	}

}
 