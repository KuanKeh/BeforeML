package codewars;

import java.util.Collections;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static String print(int i) {
		if(i < 0 || i % 2 ==0) {
			return null;
		}
		String.join("", Collections.nCopies(5, ""));
		
		StringBuilder sbr = new StringBuilder();
		int space = i/2;
		for(;space >= 0;space--) {
			
		}
		return sbr.toString();
	}
}
