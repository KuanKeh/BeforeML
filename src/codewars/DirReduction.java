package codewars;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.function.Supplier;

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
	
	public static String[] dirReduc2(String[] arr) {
		final Stack<String> stack = new Stack<>();

		for (final String direction : arr) {
			final String lastElement = stack.size() > 0 ? stack.lastElement() : null;

			switch(direction) {
				case "NORTH": if ("SOUTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
				case "SOUTH": if ("NORTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
				case "EAST":  if ("WEST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
				case "WEST":  if ("EAST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
			}
		}
//		Supplier<String[]> s = String[]::new;
		Supplier<String> s = String::new;
		return stack.stream().toArray(String[]::new);
    }
	
	public static void prinn(String[] arr) {
		for(String a : arr) {
			System.out.print(a+",");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		String[] ins1 = {"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH","WEST"};
//		String[] ins2 = {"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH"};
		prinn(dirReduc3(ins1));
		Stack<String> stack = new Stack<String>();
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.pop();
		System.out.println(stack);
	}
	
	public static String[] dirReduc3(String[] arr) {
		Stack<String> stack = new Stack<String>();
		for(String direction : arr) {
			String last = stack.size() > 0 ? stack.lastElement() : null;
			switch(direction) {
				case "NORTH" :
					if("SOUTH".equals(last)) stack.pop(); else stack.push(direction);break;
				case "SOUTH" :
					if("NORTH".equals(last)) stack.pop(); else stack.push(direction);break;
				case "WEST" :
					if("EAST".equals(last)) stack.pop(); else stack.push(direction);break;
				case "EAST" :
					if("WEST".equals(last)) stack.pop(); else stack.push(direction);break;
			
			}
		}
		return stack.stream().toArray(String[]::new);
	}
}
