package dataStruct.sort;

public class InsertSort extends Sorts {

	public InsertSort() {
	}

	public static void main(String[] args) {
		Integer[] a = {6,7,8,4,3,5,2};
//		char c = 1;
//		byte b = c;
//		byte b = 1;
//		char c = b;
		long l = 11111;
		float f = l;
		show(a);
		sort(a);
//		print(a);
	}
	
	public static void sort(Comparable[] a) {
		for(int i = 1; i < a.length; i++) {
			System.out.println("i = " + i);
			for(int j = i; j > 0 && less(a[j],a[j-1]); j--) {
				System.out.println("j = " + j);
				exch(a,j-1,j);
				show(a);
			}
		}
	}

}
