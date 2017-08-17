/**
 * 
 */
package beforeML;

/**
 * @author Kuan
 *
 */
public class Sorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {9,27,28,0,90,15,88,36,91,96,44,9};
//		int[] a = new int[12];
//		for(int i = 0; i < a.length; i++ ){
//			a[i] = (int) (Math.random()*100);
//			System.out.print(a[i] + ",");
//		}
//		System.out.println();
		sort2(a);
		for(int x : a){
			System.out.println(x);
		}
	}
	/**
	 * 选择排序
	 */
	public static void sort(int[] a){
		for( int i = 0; i < a.length -1; i++ ){
			max(a,i);
		}
//		System.out.println(a.toString());
	}
	
	/**
	 * 选择排序
	 */
	public static void sort2(int[] a){
		for( int i = a.length - 1 ; i > 0 ; i-- ){
			max2(a,i);
		}
	}
	
	/**
	 * 最大值
	 */
	public static void max(int[] a, int i){
		int temp = a[0];
		int idx = 0;
		for(int j = 1; j < a.length - i; j++){
			if(a[j] > a[idx]){
				idx = j;
			}
		}
		temp = a[idx];
		a[idx] = a[a.length - 1 - i]; 
		a[a.length - 1 - i] = temp;
	}
	
	/**
	 * 最大值
	 */
	public static void max2(int[] a, int i){
		int temp = a[0];
		int idx = 0;
		for(int j = 1; j < i; j++){
			if(a[j] > a[idx]){
				idx = j;
			}
		}
		temp = a[idx];
		a[idx] = a[i]; 
		a[i] = temp;
		for(int x:a){
			System.out.print(x+",");
		}
		System.out.println();
	}

}
