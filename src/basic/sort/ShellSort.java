package basic.sort;

public class ShellSort extends Sorts{

	public ShellSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = {90,89,88,87,86,85,84,83,82,81,80};
		System.out.println(33);
		show(a);
		sorts(a);
	}
	
	public static void sorts(Comparable[] a) {
		int N= a.length;//11
		int h = 1;
		while(h < N/3) {
			h = h * 3 + 1;
		}//h = 4
		while(h >= 1) {
			for(int i = h; i < N ; i++) {
				for(int j = i; j >= h && less(a[j],a[j-h]); j-=h) {
					exch(a,j,j-h);
					show(a);
				}
			}
			h = h/3;
		}
	}
}
