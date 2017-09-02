package weng;

import java.util.HashMap;
import java.util.Scanner;

public class SomeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i =-1;
//		int j = i;
//		System.out.println(j);
//		i = -2;
//		System.out.println(j);
//		String s1 = "cc";
//		String s2 = s1;
//		System.out.println(s2);
//		s1 = "dd";
//		System.out.println(s2);
//		Library b = new Library(1, "cc");
//		Library b1 = b;
//		Library b2 = b;
//		System.out.println("b.i = " + b.i + " &b1.i = " + b1.i + " &b2.i = " + b2.i);
//		b.i = 2;
//		System.out.println("b.i = " + b.i + " &b1.i = " + b1.i + " &b2.i = " + b2.i);
//		b1.i = 3;
//		System.out.println("b.i = " + b.i + " &b1.i = " + b1.i + " &b2.i = " + b2.i);
//		b2.i = 4;
//		System.out.println("b.i = " + b.i + " &b1.i = " + b1.i + " &b2.i = " + b2.i);
		
//		String s1 = "abc";
//		String s2 = "abc";
//		String s3 = "def";
//		System.out.println(s1==s2);
//		System.out.println(s2==s3);
//		s2 = "def";
//		System.out.println(s1==s2);
//		System.out.println(s2==s3);
//		String s1 = new String("aa");
//		System.out.println(s1);
//		long start = System.currentTimeMillis();
//		for(int i = 0; i < 70000; i++) {
//			s1 = new String (s1 + "bb");
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end-start);
//		
//		String s2 = new String("cc");
//		System.out.println(s2);
//		long start2 = System.currentTimeMillis();
//		for(int i = 0; i < 70000; i++) {
//			s2 = s2 + "bb";
//		}
//		long end2 = System.currentTimeMillis();
//		System.out.println(end2-start2);
//		
//		StringBuffer s3 = new StringBuffer("dd");
//		System.out.println(s3);
//		long start3 = System.currentTimeMillis();
//		for(int i = 0; i < 70000; i++) {
//			s3.append("bb");
//		}
//		long end3 = System.currentTimeMillis();
//		System.out.println(end3-start3);
		
//		int[] jjj = new int[3];
//		jjj[0] = 5;
//		jjj[1] = 6;
//		jjj[2] = 7;
//		System.out.println(jjj);
//		
//		HashMap<String,String> hs = new HashMap<String,String>();
//		hs.put("a", "1");
//		hs.put("b", "2");
//		System.out.println(hs);
//		System.out.println(hs.toString());
//		int[] num ;
		
//		int[] times = new int[10];
//		for(int x = 0; x<times.length; x++) {
//			times[x] = 0;
//		}
//		Scanner in = new Scanner(System.in);
//		while(true) {
//			int temp = in.nextInt();
//			if(temp!=-1) {
//				times[temp]++;
//			}else {
//				break;
//			}
//		}
//		for(int x = 0; x<times.length; x++) {
//			System.out.println(times[x]);
//		}
//		for(int i = 10; i>0 ; i--) {
//			System.out.println(i);
//		}
//		System.out.println("abc");
//		cal(1);
//		int x;
//		x = max(6,8);
//		x = max(x,19);
		
//		int a[] = {0,1};
//		System.out.println("a[0] = " + a[0]);
//		changeArray(a);
//		System.out.println("a[0] = " + a[0]);
//		int a = 0;
//		System.out.println(a);
//		f(a);
//		System.out.println(a);
		
//		String s = "c";
//		System.out.println(s);
//		d(s);
//		System.out.println(s);
//		a();
//		b();
//		fabonacci();
		numbers();
	}
	
	public static int max(int a,int b) {
		return a>b?a:b;
	}
	
	public static void changeArray(int[] b) {
		b[0]=3;
		System.out.println(b[0]);
	}
	
	public static void f(int a) {
		a = 3;
	}
	
	public static void d(String a) {
		a = "k";
	}
	
	public static void a() {
		int amount = 83;
		for(int one = 0; one<=100;one++)
			for(int five = 0; five<=100;five++)
				for(int ten = 0; ten<=100;ten++)
					for(int twenty = 0; twenty<=100;twenty++)
						if(one+five*5+ten*10+twenty*20==amount) {
							System.out.println(one+"张1元"+five+"张5元"+ten+"张10元"+twenty+"张20元-->"+amount);
						}
	}
	
	public static void b() {
		int sum = 0;
		for(int i = 1; i<=5; i++ ) {
			int mult = 1;
			for(int j = 1; j<=i; j++) {
				mult *= j;
			}
			sum +=mult;
		}
		System.out.println(sum);
	}
	
	public static void fabonacci() {
		int a = 0;
		int b = 1;
		int c = 1;
		int sum = 2;
		for( int i = 4; i <=7; i++ ) {
			a = b;
			b = c;
			c = a+b;
			sum += c;
		}
		System.out.println(sum);
	}
	
	public static void numbers() {
		Scanner in = new Scanner(System.in);
		int i = in .nextInt();
		int mode = 0;
		int temp = i;
		while(temp>0) {
			mode++;
			temp/=10;
		}
		System.out.println("mode = " + mode);
		int mode2 = 1;
		for(int j = 1; j<mode; j++) {
			mode2*=10;
		}
		while(mode2>0) {
			System.out.println(i/mode2);
			i%=mode2;
			mode2/=10;
		}
		
		
		
//		int temp = 0;
//		do {
//			temp = temp*10+i%10;
//			System.out.println(temp);
//			i=i/10;
//		}while(i>0);
//		do {
//			System.out.println(temp%10);
//			temp = temp/10;
//		}while(temp>0);
	}
}

