package jumble;

public class Newton {
	private static int i = 11;
	public static void main(String[] args) {
		Newton newton = new Newton();
		System.out.println(newton.i);
	}
	
	private void count(){
		System.out.println(000);
		printc();
	}
	
	private void printc(){
		System.out.println("now in printc");
		count();
	}
}
