package jumble;

public class Cla {
	public static void main(String[] args){
		Cla cla = new Cla();
		System.out.println(cla.n);//1
		System.out.println(cla.m);//0  调用method时，n尚未初始化，只是放入了符号表；符号表里n的值是int的默认值0
		
		System.out.println(cla.b);//1
		System.out.println(cla.a);//1 b是static，优先初始化
	}
	private static int i;
	static{
		System.out.println("static block! i = " + i);
	}
	int method(){return n;}
	int m = method();
	int n = 1;
	
	static int method2(){return b;}
	int a = method2();
	static int b = 1;
	
	
}
