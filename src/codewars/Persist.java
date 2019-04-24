package codewars;

public class Persist {

	public Persist() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(persistence(39));
	}
	public static int persistence(long n) {
		int cnt = 0;
	    while( n >= 10){
	    	long mult = 1;
	    	long digit = 0;
	    	do {
	    		digit = n % 10;
	    		n = n / 10;
	    		mult = digit * mult;
	    	} while( n > 0 );
	    	cnt++;
	    	n = mult;
	    }
	    return cnt;
	}
	
	public static int persistence1(long n) {
	    int times = 0;
	    while (n >= 10) {
	      n = Long.toString(n).chars().reduce(1, (r, i) -> r * (i - '0'));
	      times++;
	    }
	    return times;
	  }
	
	public static int persistence2(long n) {
		long m = 1, r = n;
		if (r / 10 == 0)
			return 0;
		for (r = n; r != 0; r /= 10)
			m *= r % 10;
		return persistence(m) + 1;
	}
}
