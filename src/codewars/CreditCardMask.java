/**
 * 7 kyu
 */
package codewars;

public class CreditCardMask {

	public CreditCardMask() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new String(new char[3]));
		System.out.println(CreditCardMask.maskify2("4556364607935616"));
		System.out.println(CreditCardMask.maskify2("64607935616"));
		System.out.println(CreditCardMask.maskify2("1"));
		System.out.println(CreditCardMask.maskify2(""));
	}
	
	public static String maskify(String str) {
//		throw new UnsupportedOperationException("Unimplemented");
		return str.length()>3?(str.substring(0, str.length()-4).replaceAll(".", "#")+str.substring(str.length()-4)):str;
	}
	
	public static String maskify2(String str) {
		return str.replaceAll(".(?=.{4})", "#");
	}
}
