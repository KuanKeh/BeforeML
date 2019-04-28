/**
 * 2019-04-28
 * 4:00:32
 */
package codewars;

/**
 * @author GGY
 *
 */
public class SuperMarketQueue {

	/**
	 * 
	 */
	public SuperMarketQueue() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solveSuperMarketQueue(new int[]{1,2,3,6},2));
	}
	
	/**
	 * The function should return an integer, the total time required.
	 * @param customers  an array (list in python) of positive integers representing the queue. Each integer represents a customer, and its value is the amount of time they require to check out.
	 * @param n  a positive integer, the number of checkout tills.
	 * @return
	 */
	public static int solveSuperMarketQueue(int[] customers, int n) {
		if(customers.length == 0) {
			return 0;
		}
		int[] queues = new int[n];
		int minIndex = 0;
		int maxIndex = 0;
		int cusLength = customers.length;
		for(int k = 0; k < cusLength; k++) {
			queues[minIndex] += customers[k];
			for(int j = 0; j < n; j++) {
				if( k < cusLength - 1 ) {
					if(queues[j] < queues[minIndex]) {
						minIndex = j;
					}
				}else {
					if(queues[j] > queues[maxIndex]) {
						maxIndex = j;
					}
				}
			}
		}
		return queues[maxIndex];
	}
}
