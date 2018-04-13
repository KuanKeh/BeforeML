package basic;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

class Parent{
	public String name = "parent";
	public Parent() {
		
	}
	public String getName() {
		System.out.println("parent getname");
		return name;
	}
	public long add() {
		return 0;
	}
	int change() {
		return 0;
	}
}

public class Child extends Parent{
	private String department;
	String _abc = "";
	public String name = "child";

	public Child() {//出错
		
	}
	public String getValue() {
		return department;
	}
//	public String getName() {
//		System.out.println("child getname");
//		return name;
//	}
	public long add() {
		return 0;
	}
	public int add(int a) {
		return 0;
	}
	
	protected int change() {
		return 0;
	}
	
	int change(int i) {
		return 0;
	}
	public static void main(String[] args) {
		Parent p = new Parent();
		int i ,sum;
		for(i=1,sum=0;;i++,sum=sum+i) 
			if(i>10)
				break;
		System.out.println(sum);
		int c = 16;
		double a = c;
		System.out.println(a);
		double b = Math.sqrt(a);
		System.out.println(b);
//		Scanner in = new Scanner(System.in);
		char cc = '吃';
		int bb = (int)cc;
		System.out.println("bb="+bb);
		byte[] b1 = null;
		try {
			b1 = "吃".getBytes("GB2312");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(b1.length);
		for(byte b11:b1) {
			System.out.println(b11);
		}
		int aa = 0;
		char ch = 'c';
//		Character.BYTES;
		try {
			aa = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(aa);
	}
}
