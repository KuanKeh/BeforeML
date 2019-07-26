package basic;

public class TestString {

	public static void main(String[] args) {
		String s = "abc";
		String ss = "ok" + s + "xyz" + 5;
		System.out.println(ss);
		String hashTest = "abc";
		System.out.println("hashcode=" + hashTest.hashCode());
		
		
		int r = 50;
		long start1 = System.currentTimeMillis();
		for(int k = 0; k < 1000000; k++) {
			int cc = r << 5;
		}
		long start2 = System.currentTimeMillis();
		String ccs ="";
		for(int k = 0; k < 1000000; k++) {
			ccs = "" + r + 3;
		}
		long start3 = System.currentTimeMillis();
		StringBuilder sbd = new StringBuilder();
		for(int k = 0; k < 1000000; k++) {
			sbd.append("").append(r).append(3);
		}
		long start4 = System.currentTimeMillis();
		for(int k = 0; k < 1000000; k++) {
			int cc = r * 32;
		}
		long end = System.currentTimeMillis();
		System.out.println("s1 = " + (start2 - start1) + " &s2 = " 
		+ (start3 - start2) + " &s3 = " + (start4 - start3) + " &s4 = " + (end - start4));
	}
}
