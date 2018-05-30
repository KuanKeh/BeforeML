package dataStruct;

public class PrintN {
	public static void cycle(int n){
		long begin = System.currentTimeMillis();
		for(int i=0; i < n; i++){
//			System.out.println(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("time1 = " + (end-begin));
	}
	
	public static void recursion(int n){
//		long begin = System.currentTimeMillis();
		if(n != 0){
			recursion(n-1);
//			System.out.println(n);
		}
//		long end = System.currentTimeMillis();
//		System.out.println("recursion time = " + (end-begin));
	}
	
	public static void main(String[] args){
		cycle(9999);
		long begin = System.currentTimeMillis();
		recursion(9999);
		long end = System.currentTimeMillis();
		System.out.println("recursion time = " + (end-begin));
	}
	
}
