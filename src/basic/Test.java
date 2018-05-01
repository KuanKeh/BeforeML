package basic;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
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
		// TODO Auto-generated method stub
//		System.out.println(Test.rever(-121));
//		StringBuilder sb = new StringBuilder("-1");
//		System.out.println(sb.reverse());
		String test = "吃饭????喝酒";
		test = test.replace("????", "\r\n");
		System.out.println(test);
	}

}
