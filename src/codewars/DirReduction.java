package codewars;

import java.util.HashMap;
import java.util.Map;

public class DirReduction {
	public static String[] dirReduc(String[] arr) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("WEST", "EAST");
		map.put("EAST", "WEST");
		map.put("NORTH", "SOUTH");
		map.put("SOUTH", "NORTH");
		for(int i = 0; i < arr.length - 1; i++) {
			if(map.get(arr[i]).equals(arr[i+1])) {
				String[] ret = new String[arr.length - 2];
				int temp = 0;
				for(int j = 0; j < ret.length; j++) {
					if(temp == i) {
						temp += 2;
					}
					ret[j] = arr[temp++];
				}
				return dirReduc(ret);
			}
		}
		return arr;
	}
}
