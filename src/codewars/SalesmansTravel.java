package codewars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SalesmansTravel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String r = "123 Main Street St. Louisville OH 43071,432 Main Long Road St. Louisville OH 43071,786 High Street Pollocksville NY 56432";
		String k = "";
		String[] ks = k.split(",");
		System.out.println(ks.length);
		System.out.println("ks[0] = " + ks[0]);
//		System.out.println(travel(r,"OH 43071"));
	}

	public static String travel(String r, String zipcode) {
		String ret = "";
		String[] destinations = r.split(",");
		int length = destinations.length;
		if(length > 0 && !"".equals(destinations[0]) ) {
			String houseNumberRegex = "\\b\\d+\\b";
			String zipcodeRegex = "[A-Z]{2}";
			Pattern houseNumberPattern = Pattern.compile(houseNumberRegex);
			Pattern zipcodePattern = Pattern.compile(zipcodeRegex);
			Matcher matcher1 = houseNumberPattern.matcher(r);
			for(int i = 0; i < length ; i++) {
				
			}
			
		}
		return ret;
	}
}
