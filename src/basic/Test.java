package basic;

import java.util.LinkedList;

import sun.misc.BASE64Encoder;

public class Test {

	public Test() {
	}
	
	public static boolean rever(int x) {
		boolean bo = false;
		int y = x;
		int pa = 0;
		int rev = 0;
		while(y!=0) {
			pa = y%10;
			rev = rev*10+pa;
			y = y/10;
		}
		System.out.println("rev = " + rev);
		bo=(rev==x);
		return bo;
	}

	public static void main(String[] args) {
		System.out.println(Test.rever(-121));
		StringBuilder sb = new StringBuilder("-1");
		System.out.println(sb.reverse());
		String a = "试图转成base64";
		BASE64Encoder ba = new BASE64Encoder();
		System.out.println(ba.encode(a.getBytes()));
		LinkedList<String> l = new LinkedList<String>();
		l.add("abc");
		l.add("ef");
		
		String source = "";
		char[] abc = source.toCharArray();
		System.out.println(abc.length);
		System.out.println(abc[0]);
		abc[0] = 'c';
		System.out.println(String.valueOf(abc));
	}

}
