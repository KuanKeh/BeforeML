package dataStruct.sort;

public class Selection extends Sorts {

	public Selection() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = {6,7,8,4,3,5,2};
		show(a);
		sort(a);
		show(a);
	}
	
	public static void sort(Comparable[] a) {
		for(int i = 0; i < a.length-1; i++) {
			int min = i;
			for(int j = i+1; j < a.length;j++) {
				if(less(a[j],a[min])) {
					exch(a,i,j);
					show(a);
					min = j;
				}
			}
			exch(a,min,i);
			show(a);
		}
	}

}
