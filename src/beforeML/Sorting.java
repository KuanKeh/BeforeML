/**
 * 
 */
package beforeML;

/**
 * @author gyge
 *
 */
public class Sorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,5,4,6,7,8,2,10,17,13,12,11};
		sort(a);
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
	 * 最大值
	 */
	public static void max(int[] a, int i){
		int temp = a[0];
		int idx = 0;
		for(int j = 1; j < a.length - i; j++){
			if(a[j] > temp){
				idx = j;
				temp = a[j];
			}
		}
		a[idx] = a[a.length - 1 - i]; 
		a[a.length - 1 - i] = temp;
	}

}
