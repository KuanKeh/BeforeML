package basic;

public class Sorts {

	public Sorts() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,2,1,0};
		Sorts.sorts(a);

	}
	//bubble
	private static void sorts(int[] a) {
		for(int j = 1; j<a.length;j++) {
			for(int i = 0;i<a.length-j;i++) {
				//int temp = a[i];
				if(a[i]>a[i+1]) {
					int temp = a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
		for(int i = 0; i<a.length;i++) {
			System.out.print(a[i]+",");
		}
	}

}
