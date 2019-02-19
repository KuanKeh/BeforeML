package codewars;

public class Persist {

	public Persist() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(persistence(39));
	}
	
//	public static int persistence(long n) {
//	    int times = 0;
//	    while (n >= 10) {
//	      n = Long.toString(n).chars().reduce(1, (r, i) -> r * (i - '0'));
//	      times++;
//	    }
//	    return times;
//	  }
	
	public static int persistence(long n) {
		long m = 1, r = n;
		if (r / 10 == 0)
			return 0;
		for (r = n; r != 0; r /= 10)
			m *= r % 10;
		return persistence(m) + 1;
	}
}
