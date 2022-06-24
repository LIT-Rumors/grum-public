package api;
public class BrokerConfig {

	public static String URL = "tcp://localhost";
static{String custurl = System.getProperty("broker");
		if(custurl!=null) {
			URL = custurl;
		}}}