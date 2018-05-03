package basic;

public class FullWidthAndHalfWidth {
//	public void main
	public static void main(String[] args){
		String a = "   ";
		System.out.println(a.replaceAll("[\u3000]","3"));
	}
}
