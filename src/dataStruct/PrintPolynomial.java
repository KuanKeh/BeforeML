package dataStruct;

public class PrintPolynomial {
	public static void f1(double x, int max,double a){
		double result = a;
		for(int i=0; i<max;i++){
			result += Math.pow(x, i)/i;
		}
	}
	
	public static void f2(double x, int max,double a){
		double result = 1/max;
		for(int i = max; i>1;i--){
			result = 1/(i-1) + result*x;
		}
		result = a + result*x;
	}
	
	public static void main(String[] args){
		int max = 100000;
		long begin1 = System.currentTimeMillis();
		for(int i=1; i<max; i++) f1(1.1,100,1.0);
		long end1 = System.currentTimeMillis();
		System.out.println("f1 time = " + (end1-begin1)/(float)max);
		long begin2 = System.currentTimeMillis();
		for(int i=1; i<max; i++) f2(1.1,100,1.0);
		long end2 = System.currentTimeMillis();
		System.out.println("f2 time = " + (end2-begin2)/(float)max);
	}
	
}
