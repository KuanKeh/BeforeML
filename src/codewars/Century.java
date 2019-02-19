package codewars;

public class Century {
	public static int century(int year) {
		int cen = 0, res = 0;
		if(year % 100 == 0) {
			cen = year / 100;
		}else {
			cen = year / 100 + 1;
		}
		return cen;
	}
	
	//
	public static int century2(int number) {
		return (number + 99) / 100;
	}
}
