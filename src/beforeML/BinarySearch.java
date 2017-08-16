/**
 * 
 */
package beforeML;

/**
 * @author gyge
 *
 */
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * 二分搜索
	 */
	public static int search( int[]a , int k ) {
		int x = 0;//{1,3,5,6,7,9}
		int ret = -1;
		int l = 0;
		int r = a.length - 1;
		int m = (l+r)/2;
		while(l!=r){
//			System.out.println("x = " + x++);
			m = (l+r)/2;
			System.out.println("r = " + r);
			if(a[m]>k){
				r = m-1;
			}else if(a[m]<k){
				l = m+1;
			}else{
				ret = m;
				break;
			}
//			System.out.println("r = " + r);
		}
		if(a[l] == k){
			ret = l;
		}
		return ret;
	}
}
