package basic.sort;

public class BubbleSort extends Sorts{

	public BubbleSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = {6,7,8,4,3,5,2};
//		System.out.println(less(a[3],a[0]));
//		System.out.println(a[3]+"&"+a[0]);
		show(a);
		newSort(a);
		show(a);
	}
	
	public static void sort(Comparable[] a) {
		for(int i = a.length-1; i >= 0; i--) {
			System.out.println("i = " + i);
			for(int j = 0; j < i ; j++) {
				System.out.println("j = " + j);
//				System.out.print("a[j+1] = " + a[j+1] + " a[j] = " + a[j] + "|");
				if(less(a[j+1],a[j])) {
					exch(a,j+1,j);
					show(a);
				}
			}
		}
	}
	
	public static void newSort(Comparable[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.println("i = " + i);
			for(int j = i+1; j < a.length; j++) {
				System.out.println("j = " + j);
//				System.out.print("a[i] = " + a[i] + " a[j] = " + a[j] + "|");
				if(less(a[j],a[i])) {
					exch(a,i,j);
					show(a);
				}
			}
			System.out.println();
		}
	}
}
