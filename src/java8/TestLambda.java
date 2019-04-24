package java8;

public class TestLambda {

	public TestLambda() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaInterface l1 = new LambdaInterface() {
			
			@Override
			public void showKey(String s) {
				// TODO Auto-generated method stub
				System.out.println("is it " + s);
			}
		};
		LambdaInterface l2 = new LambdaImpl();
		
		LambdaInterface l3 = (s)->System.out.println("why key is " + s);
		
		l1.showKey("l1");
		l2.showKey("l2");
		l3.showKey("l3");
		
		String s = "001";
		char c = s.charAt(0);
		System.out.println('0'-0);
	}

}
