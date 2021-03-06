package dataStruct.sort;

public class Sorts {

	public Sorts() {
	}
	
	protected static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	
	protected static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	protected static void show(Comparable[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
	}
	
	static boolean isSorted(Comparable[] a) {
		for(int i = 0; i < a.length-1; i++) {
			if(less(a[i+1],a[i])) {
				return false;
			}
		}
		return true;
	}
	
}
