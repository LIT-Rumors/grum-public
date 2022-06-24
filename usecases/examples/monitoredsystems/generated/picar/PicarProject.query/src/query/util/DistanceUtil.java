package query.util;

import at.jku.lit.grum.picar.model.picar.Picar;

public class DistanceUtil {

	static class LLA {
		private final double lat;

		public double getLat() {
			return lat;
		}

		public double getLon() {
			return lon;
		}

		public double getAlt() {
			return alt;
		}

		public LLA(double lat, double lon, double alt) {
			super();
			this.lat = lat;
			this.lon = lon;
			this.alt = alt;
		}

		private final double lon;
		private final double alt;
	}

	static class PVector {

		private final double x;
		private final double y;

		public double getX() {
			return x;
		}

		public double getY() {
			return y;
		}

		public double getZ() {
			return z;
		}

		private final double z;

		public PVector(double x, double y, double z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}

	}

	public static final double SEMI_MAJOR = 6378137.0;
	public static final double SEMI_MINOR = 6356752.31;// 4245;

	public static double testDistance(double lat1, double lon1, double alt1, double lat2, double lon2, double alt2) {
		return laserDistance(new LLA(lat1, lon1, alt1), new LLA(lat2, lon2, alt2));

	}

	static double laserDistance(LLA a, LLA b) {
		PVector pa = convert(a);
		PVector pb = convert(b);
		double dx = pa.getX() - pb.getX();
		double dy = pa.getY() - pb.getY();
		double dz = pa.getZ() - pb.getZ();
		return Math.sqrt(dx * dx + dy * dy + dz * dz);
	}

	public static PVector convert(LLA loc) {
		double lat = Math.toRadians(loc.getLat());
		double lon = Math.toRadians(loc.getLon());
		double cosLat = Math.cos(lat);
		double x = Math.cos(lon) * cosLat;
		double y = Math.sin(lon) * cosLat;
		double z = Math.sin(lat);

		/*
		 * The formula this code is based on can be found in a journal article called:
		 * "A Non-singular Horizontal Position Representation" by Kenneth Gade. You can
		 * find it at https://goo.gl/iCqdCn (see equation 22 in appendix B)
		 * 
		 * Note: equation 22 is unconventional as it swaps the z component with x
		 * component. This code follows the more common convention and returns z and x
		 * to their proper place
		 */
		double a = SEMI_MAJOR;
		double b = SEMI_MINOR;
		double ab2 = (a * a) / (b * b);
		double f = b / Math.sqrt(z * z + ab2 * y * y + ab2 * x * x);
		double pz = f * z + loc.getAlt() * z;
		double py = f * ab2 * y + loc.getAlt() * y;
		double px = f * ab2 * x + loc.getAlt() * x;
		return new PVector(px, py, pz);

	}

	public static String getCurrentDistance(Picar car) {
		return "" + Math.round(laserDistance(
				new LLA(car.getStartlocation().getLat(), car.getStartlocation().getLon(),
						car.getStartlocation().getAlt()),
				new LLA(car.getLocation().getLat(), car.getLocation().getLon(), car.getLocation().getAlt())));
	}
}