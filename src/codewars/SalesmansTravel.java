package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SalesmansTravel {
	
	static Logger log = Logger.getLogger("SalesmansTravel");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String r = "123 Main Street St. Louisville OH 43071,432 Main Long Road St. Louisville OH 43071,786 High Street Pollocksville NY 56432";
		System.out.println(travel3(r,"OH 43071"));
//		String k = "";
//		String[] ks = k.split(",");
//		System.out.println(ks.length);//1
//		System.out.println("ks[0] = " + ks[0]);
//		String addr = "123 Main Street St. Louisville OH 43071";
//		String regex = "\\b\\d{1,50}\\b";
//		regex = "(?<=\\d{1,50}\\s{1,50})[\\.\\s\\S]{1,50}(?=\\s{1,50}OH 43071)";
//		match(regex,addr);
//		String k = "  ";
//		System.out.println(k.isEmpty());
		
	}

	public static String travel(String r, String zipcode) {
		if(zipcode != null && !"".equals(zipcode.trim())) {
			StringBuilder ret = new StringBuilder();
			String[] destinations = r.split(",");
			int length = destinations.length;
			if(length > 0 && !"".equals(destinations[0]) ) {
				Pattern zipcodePattern = Pattern.compile("\\b" + zipcode + "\\b");
				
				String houseNumberRegex = "\\b\\d{1,50}\\b";
				Pattern houseNumberPattern = Pattern.compile(houseNumberRegex);
				
				String addressRegex = "(?<=\\d{1,50}\\s{1,50})[\\.\\s\\S]{1,50}(?=\\s{1,50}\\b" + zipcode + "\\b)";
				Pattern addrPattern = Pattern.compile(addressRegex);
				
				Matcher matcher = null;
				List<String> addrList = new ArrayList<String>();
				List<String> numberList = new ArrayList<String>();
				for(int i = 0; i < length ; i++) {
					matcher = zipcodePattern.matcher(destinations[i]);
					if(matcher.find()) {
						matcher = addrPattern.matcher(destinations[i]);
						if(matcher.find()) {
							addrList.add(matcher.group());
						}
						matcher = houseNumberPattern.matcher(destinations[i]);
						if(matcher.find()) {
							numberList.add(matcher.group());
						}
					}
				}
				ret.append(zipcode).append(':');
				for( int i = 0; i < addrList.size(); i++ ) {
					ret.append(addrList.get(i));
					if(i != addrList.size() - 1) {
						ret.append(',');
					}
				}
				ret.append('/');
				for( int i = 0; i < numberList.size(); i++) {
					ret.append(numberList.get(i));
					if(i != addrList.size() - 1) {
						ret.append(',');
					}
				}
			}
			return ret.toString();
		}else {
			return zipcode + ":/";
		}
	}
	
	public static void match(String regex, String source) {
		log.info("regex : " + regex);
		log.info("source : " + source);
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(source);
		boolean find = matcher.find();
		log.info("find : " + find);
		if(find) {
			log.info(regex + " : " + matcher.group());
		}
	}
	
	public static String travel2(String r, String zipcode) {
        if (zipcode.isEmpty()) {
            return zipcode + ":/";
        }

        String[] addresses = r.split(",");
        String streets = "", houseNumbers = "/";

        Pattern regex = Pattern.compile("(\\d+)\\s((\\w+\\.?\\s)+)" + zipcode);
        Matcher matcher;

        for (String address : addresses) {
            if (address.endsWith(zipcode)) {
                matcher = regex.matcher(address);
                while (matcher.find()) {
                    houseNumbers += matcher.group(1).trim() + ",";
                    streets += matcher.group(2).trim() + ",";
                }
            }
        }

        if (streets.isEmpty()) {
            return zipcode + ":/";
        } else {
            return zipcode + ":" + streets.substring(0, streets.length() - 1) + houseNumbers.substring(0, houseNumbers.length() - 1);
        }
    }
	
	public static String travel3(String r, String zipcode) {
	    
        if (zipcode.isEmpty()) return ":/";
    
        List<String> addresses = Arrays.stream(r.split(","))
                .filter(s -> s.endsWith(zipcode))
                .map(s -> s.replaceAll("(.*)(\\w\\w \\d+)$", "$1"))
                .map(String::trim)
                .collect(Collectors.toList());
//        return addresses.stream().map(s -> s.replaceAll("(\\d+) (.*)", "$1")).collect(Collectors.joining(","));
        return zipcode
                + ":"
                + addresses.stream().map(s -> s.replaceAll("(\\d+) (.*)", "$2")).collect(Collectors.joining(","))
                + "/"
                + addresses.stream().map(s -> s.replaceAll("(\\d+) (.*)", "$1")).collect(Collectors.joining(","))
                ;
    }
}
