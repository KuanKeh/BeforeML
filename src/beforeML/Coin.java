package beforeML;

import java.util.HashMap;
import java.util.Scanner;

public class Coin {
	private HashMap<Integer, String> coinnames = new HashMap<Integer, String>();
	
	public Coin(){
		coinnames.put(1, "penny");
		coinnames.put(10, "dime");
		coinnames.put(25, "quarter");
		coinnames.put(50, "half-dolar");
		coinnames.put(50, "五毛");
		System.out.println(coinnames.keySet());//[50, 1, 25, 10]
		System.out.println(coinnames.keySet().size());//4
		System.out.println(coinnames);//{50=五毛, 1=penny, 25=quarter, 10=dime}
	}
	
	public String getName(int amount){
		if(coinnames.containsKey(amount))
			return coinnames.get(amount);
		else
			return "NOT FOUND";
	}
	
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int amount = in.nextInt();
		Coin coin = new Coin();
//		System.out.println(coin.getName(amount));
//		String[] s = {"1","2","4","4","5"};
//		System.out.println(s);
	}

}
