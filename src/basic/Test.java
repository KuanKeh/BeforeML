package basic;

import java.util.LinkedList;
import java.util.List;

import sun.misc.BASE64Encoder;

public class Test {
	static {
		System.out.println("Test static");
	}
	
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
	
	public static void changeSbd(StringBuilder sbd) {
		sbd.append("aa");
	}
	public static int overload(List<String> list) {//javac 1.6
		return 1;
	}
	public static String overload(List<Integer> list) {//javac 1.6
		return "";
	}

	public static void main(String[] args) {
		
		StringBuilder sbd = new StringBuilder("kk");
		System.out.println(sbd.toString());
		changeSbd(sbd);
		System.out.println(sbd.toString());
		System.out.println("test:" + Father.age);
		
		
//		System.out.println(Test.rever(-121));
//		StringBuilder sb = new StringBuilder("-1");
//		System.out.println(sb.reverse());
//		String a = "试图转成base64";
//		BASE64Encoder ba = new BASE64Encoder();
//		System.out.println(ba.encode(a.getBytes()));
//		LinkedList<String> l = new LinkedList<String>();
//		l.add("abc");
//		l.add("ef");
//		
//		String source = "";
//		char[] abc = source.toCharArray();
//		System.out.println(abc.length);
//		System.out.println(abc[0]);
//		abc[0] = 'c';
//		System.out.println(String.valueOf(abc));
	}

	static void four(){
		int[] arr={23,34,65,23,67,98,23,34};
		for(int i = 0 ;i < arr.length;i++){
			int count =0;//计数器 换一个i就重置0
			for(int j = i+1;j<arr.length;j++){//j是i右边的数。比如i=0时，arr[0]和arr[1],arr[2]...挨个比过去
				if(arr[i] == arr[j]){//某个arr[i]和他右边的一个数相等，比如i=0时arr[i]=23，在j=3时arr[j],相等了。
					count++;//计数，看看这个arr[i]的右边有多少个和他相等的数
					if(count == 1){//第一次相等  主要为了下面打印   比如i=0时，所有打印出来的应该是"23 :0,3,6,"
						System.out.print(arr[i] + " :"+i+"," +j+",");
					}
					else{
						System.out.print(j+",");//这里打印不用加23和冒号了
					}
				}
			}
		}
	}
}
