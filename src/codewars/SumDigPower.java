package codewars;

import java.util.LinkedList;
import java.util.List;

public class SumDigPower {
	public static List<Long> sumDigPow(long a, long b){
		List<Long> list = new LinkedList<Long>();
		
		for(long l = a; l <= b; l++) {
			long temp = l;
			List<Integer> digits = new LinkedList<Integer>();
			do {
				digits.add((int) (temp/10));
				temp %= 10;
			}while(temp != 0);
			long sum = 0;
			int count = 1;
			for(int i = digits.size() - 1; i >= 0; i--) {
				sum += Math.pow(digits.get(i), count ++);
				if(sum > l) {
					break;
				}
			}
			if(sum == l) {
				list.add(l);
			}
		}
		
		return list;
	}
	public static long digPow(int n, int p) {
		// your code
	    long sum = 0;
	    for(char c : (""+n).toCharArray()){
	    	sum += Math.pow(c-'0',p++);
	    }
	    
	    return (sum%n==0)?(sum/n):-1;
	}
	
	public static List<Long> sumDigPow2(long a, long b){
		List<Long> list = new LinkedList<Long>();
		for(long l = a; l <= b; l++) {
			long temp = l;
			long sum = 0;
			int count = 1;
			for( char c : (""+l).toCharArray()) {
				sum += Math.pow(c - '0', count ++);
				if(sum > l) {
					break;
				}
			}
			if(sum == l) {
				list.add(l);
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		System.out.println('0' - 0);
	}
}
