/**
 * 
 */
package weng;

import java.util.Scanner;

/**
 * @author GGY
 *
 */
public class Cycles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		useWhile(in);
//		useDoWhile(in);
	}

	/**
	 * @param in
	 */
	public static void useWhile(Scanner in) {
		int x = in.nextInt();
		int sum = 0;
		while(x > 0) {
			sum+=x%10;
			x = x/10;
			System.out.println("bb");
		}
		System.out.println(sum);
	}
	
	/**
	 * @param in
	 */
	public static void useDoWhile(Scanner in) {
		int x = in.nextInt();
		int sum = 0;
		do{
			sum += x%10;
			x = x/10;
			System.out.println("cc");
		}while(x > 0);
		System.out.println(sum);
	}

}
